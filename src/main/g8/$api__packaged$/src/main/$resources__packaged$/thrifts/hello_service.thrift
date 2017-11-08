namespace java $organization$.$name$.service

include "hello_domain.thrift"

service HelloService {

    hello_domain.Hello sayHello(1: string content)

}