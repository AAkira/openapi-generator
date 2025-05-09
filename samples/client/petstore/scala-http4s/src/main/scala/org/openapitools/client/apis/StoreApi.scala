/** OpenAPI Petstore
  * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
  *
  * The version of the OpenAPI document: 1.0.0
  * Contact: team@openapitools.org
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech
  * Do not edit the class manually.
  */
package org.openapitools.client.apis

import cats.effect.Concurrent
import io.circe.Encoder
import org.http4s.Uri
import org.http4s.client.Client as Http4sClient
import org.openapitools.client.models.Order
import org.openapitools.client.models.*

trait StoreApiEndpoints[F[*]] {

  def deleteOrder(orderId: String): F[Unit]
  def getInventory()(using auth: _Authorization.ApiKey): F[Map[String, Int]]
  def getOrderById(orderId: Long): F[Order]
  def placeOrder(order: Order): F[Order]

}

class StoreApiEndpointsImpl[F[*]: Concurrent](
  override val baseUrl: Uri,
  defaultHeaders: Seq[(String, String)] = Nil,
  httpClient: Http4sClient[F]
) extends BaseClient[F](baseUrl, defaultHeaders, httpClient) with StoreApiEndpoints[F] {
  
  import JsonSupports.*
  import io.circe.syntax.EncoderOps
  import cats.implicits.toFlatMapOps

  override def deleteOrder(orderId: String): F[Unit] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Unit, Unit](
      method = "DELETE",
      path = s"/store/order/${orderId}",
      body = None,
      formParameters = None,
      queryParameters = Nil,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 400 => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason))
        case r if r.status.code == 404 => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason))
    }
  }

  override def getInventory()(using auth: _Authorization.ApiKey): F[Map[String, Int]] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Unit, Map[String, Int]](
      method = "GET",
      path = s"/store/inventory",
      body = None,
      formParameters = None,
      queryParameters = Nil,
      requestHeaders = requestHeaders,
      auth = Some(auth)) {
        
        case r if r.status.code == 200 => parseJson[F, Map[String, Int]]("Map[String, Int]", r)
    }
  }

  override def getOrderById(orderId: Long): F[Order] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Unit, Order](
      method = "GET",
      path = s"/store/order/${orderId}",
      body = None,
      formParameters = None,
      queryParameters = Nil,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, Order]("Order", r)
        case r if r.status.code == 400 => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason))
        case r if r.status.code == 404 => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason))
    }
  }

  override def placeOrder(order: Order): F[Order] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Order, Order](
      method = "POST",
      path = s"/store/order",
      body = Some(order),
      formParameters = None,
      queryParameters = Nil,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, Order]("Order", r)
        case r if r.status.code == 400 => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason))
    }
  }

}


