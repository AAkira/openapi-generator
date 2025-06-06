// Models.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(FoundationNetworking)
import FoundationNetworking
#endif
import Alamofire

protocol ParameterConvertible {
    func asParameter(codableHelper: CodableHelper) -> any Sendable
}

/// An enum where the last case value can be used as a default catch-all.
protocol CaseIterableDefaultsLast: Decodable & CaseIterable & RawRepresentable
where RawValue: Decodable, AllCases: BidirectionalCollection {}

extension CaseIterableDefaultsLast {
    /// Initializes an enum such that if a known raw value is found, then it is decoded.
    /// Otherwise the last case is used.
    /// - Parameter decoder: A decoder.
    public init(from decoder: Decoder) throws {
        if let value = try Self(rawValue: decoder.singleValueContainer().decode(RawValue.self)) {
            self = value
        } else if let lastValue = Self.allCases.last {
            self = lastValue
        } else {
            throw DecodingError.valueNotFound(
                Self.Type.self,
                .init(codingPath: decoder.codingPath, debugDescription: "CaseIterableDefaultsLast")
            )
        }
    }
}

/// A flexible type that can be encoded (`.encodeNull` or `.encodeValue`)
/// or not encoded (`.encodeNothing`). Intended for request payloads.
public enum NullEncodable<Wrapped> {
    case encodeNothing
    case encodeNull
    case encodeValue(Wrapped)
}

extension NullEncodable: Equatable where Wrapped: Equatable {}
extension NullEncodable: Hashable where Wrapped: Hashable {}
extension NullEncodable: Sendable where Wrapped: Sendable {}

extension NullEncodable: Codable where Wrapped: Codable {
    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if let value = try? container.decode(Wrapped.self) {
            self = .encodeValue(value)
        } else if container.decodeNil() {
            self = .encodeNull
        } else {
            self = .encodeNothing
        }
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case .encodeNothing: return
        case .encodeNull: try container.encodeNil()
        case .encodeValue(let wrapped): try container.encode(wrapped)
        }
    }
}

public enum ErrorResponse: Error {
    case error(Int, Data?, URLResponse?, Error)
}

public enum DownloadException: Error {
    case responseDataMissing
    case responseFailed
    case requestMissing
    case requestMissingPath
    case requestMissingURL
}

public enum DecodableRequestBuilderError: Error {
    case emptyDataResponse
    case nilHTTPResponse
    case unsuccessfulHTTPStatusCode
    case jsonDecoding(DecodingError)
    case generalError(Error)
}

public struct Response<T> {
    public let statusCode: Int
    public let header: [String: String]
    public let body: T
    public let bodyData: Data?

    public init(statusCode: Int, header: [String: String], body: T, bodyData: Data?) {
        self.statusCode = statusCode
        self.header = header
        self.body = body
        self.bodyData = bodyData
    }

    public init(response: HTTPURLResponse, body: T, bodyData: Data?) {
        let rawHeader = response.allHeaderFields
        var responseHeader = [String: String]()
        for (key, value) in rawHeader {
            if let key = key.base as? String, let value = value as? String {
                responseHeader[key] = value
            }
        }
        self.init(statusCode: response.statusCode, header: responseHeader, body: body, bodyData: bodyData)
    }
}
extension Response : Sendable where T : Sendable {}

/// Type-erased ResponseSerializer
///
/// This is needed in order to use `ResponseSerializer` as a Type in `Configuration`. Obsolete with `any` keyword in Swift >= 5.7
public struct AnyResponseSerializer<T: Sendable>: ResponseSerializer {
    
    let _serialize: @Sendable (URLRequest?, HTTPURLResponse?, Data?, Error?) throws -> T
    
    public init<V: ResponseSerializer>(_ delegatee: V) where V.SerializedObject == T {
        _serialize = delegatee.serialize
    }
    
    public func serialize(request: URLRequest?, response: HTTPURLResponse?, data: Data?, error: Error?) throws -> T {
        try _serialize(request, response, data, error)
    }
}

public final class RequestTask: @unchecked Sendable {
    private let lock = NSRecursiveLock()
    private var request: Request?

    internal func set(request: Request) {
        lock.withLock {
            self.request = request
        }
    }

    internal func get() -> Request? {
        lock.withLock {
            request
        }
    }

    public func cancel() {
        lock.withLock {
            request?.cancel()
            request = nil
        }
    }
}
