import org.springframework.cloud.contract.spec.Contract

Contract.make {
  request {
    method 'GET'
    url '/example'
    headers {
      contentType applicationJsonUtf8()
    }
  }
  response {
    status 200
    body([
      string : "String"
    ])
  }
}