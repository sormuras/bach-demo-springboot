module com.github.sormuras.bach.springboot {
  requires com.fasterxml.jackson.annotation;
  requires com.fasterxml.jackson.databind;
  requires io.netty.codec;
  requires io.netty.codec.http;
  requires io.netty.codec.http2;
  requires io.netty.transport;
  requires io.netty.buffer;
  requires io.netty.transport.unix.common;
  requires org.reactivestreams;
  requires org.apache.logging.log4j;
  requires org.yaml.snakeyaml;
  requires spring.aop;
  requires spring.core;
  requires spring.beans;
  requires spring.boot;
  requires spring.boot.autoconfigure;
  requires spring.context;
  requires spring.expression;
  requires spring.jcl;
  requires spring.web;
  requires spring.webflux;
  requires reactor.core;
  requires reactor.netty.http;
  requires reactor.netty.core;

  opens com.github.sormuras.bach.springboot to
      spring.core;
  opens com.github.sormuras.bach.springboot.greetings to
      com.fasterxml.jackson.databind;

  exports com.github.sormuras.bach.springboot.greetings to
      spring.beans,
      spring.webflux;
  exports com.github.sormuras.bach.springboot to
      spring.beans;
}
