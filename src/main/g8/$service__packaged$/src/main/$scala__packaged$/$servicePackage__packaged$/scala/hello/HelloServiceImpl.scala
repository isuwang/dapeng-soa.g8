package $servicePackage$.scala.hello

import $servicePackage$.scala.hello.domain.Hello
import $servicePackage$.scala.hello.service.HelloService

import javax.annotation.Resource
import javax.sql.DataSource

import wangzx.scala_commons.sql._
import entity.Company


class HelloServiceImpl extends HelloService {

  @Resource(name = "crm_dataSource")
  var dataSource: DataSource = _

  /**
    *
    **/
  override def sayHello(content: String): Hello = {
    //需要配置scala-sql.properties才能使用SQL做语法校验, sql则不会做语法校验
    //val company = dataSource.row[Company](SQL" select * from companys where id = 119501")
    val company = dataSource.row[Company](sql" select * from companys where id = 119501")
    println(s" companyInfo: $"$"${company}")
    Hello(s"$"$"${company}")
  }
}
