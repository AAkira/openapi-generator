//
// Banana.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct Banana: Sendable, Codable, ParameterConvertible, Hashable {

    public var count: Double?

    public init(count: Double? = nil) {
        self.count = count
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case count
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(count, forKey: .count)
    }
}

