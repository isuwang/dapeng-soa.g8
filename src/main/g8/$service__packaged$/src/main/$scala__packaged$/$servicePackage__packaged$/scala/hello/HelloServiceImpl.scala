package $servicePackage$

import $servicePackage$.scala.hello.domain.Hello
import $servicePackage$.scala.hello.service.HelloService


class HelloServiceImpl extends HelloService {
  /**
    *
    **/
  override def sayHello(content: String): Hello = {
    Hello(content)
  }
}
