 package com.isuwang.soa.scala.hello.domain.serializer;

        import com.isuwang.soa.scala.hello.domain.serializer._;
        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.org.apache.thrift.protocol._

        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/

        class HelloSerializer extends TCommonBeanSerializer[com.isuwang.soa.scala.hello.domain.Hello]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.isuwang.soa.scala.hello.domain.Hello = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var content: String = null
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => content = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.isuwang.soa.scala.hello.domain.Hello(content = content)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.isuwang.soa.scala.hello.domain.Hello, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("Hello"))

      
            {
            val elem0 = bean.content 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("content", com.isuwang.org.apache.thrift.protocol.TType.STRING, 1.asInstanceOf[Short]))
            oprot.writeString(elem0)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.isuwang.soa.scala.hello.domain.Hello): Unit = {
      
              if(bean.content == null)
              throw new SoaException(SoaBaseCode.NotNull, "content字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.isuwang.soa.scala.hello.domain.Hello): String = if (bean == null) "null" else bean.toString

        }
        
      