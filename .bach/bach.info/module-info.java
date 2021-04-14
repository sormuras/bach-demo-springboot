import com.github.sormuras.bach.ProjectInfo;
import com.github.sormuras.bach.ProjectInfo.ExternalModule;
import com.github.sormuras.bach.ProjectInfo.Libraries;
import com.github.sormuras.bach.ProjectInfo.MainSpace;
import com.github.sormuras.bach.ProjectInfo.Options;
import com.github.sormuras.bach.ProjectInfo.Tools;
import com.github.sormuras.bach.ProjectInfo.Tweak;
import com.github.sormuras.bach.project.CodeStyle;

@ProjectInfo(
    options =
        @Options(
            compileModulesForJavaRelease = 16,
            formatSourceFilesWithCodeStyle = CodeStyle.GOOGLE,
            tools = @Tools(skip = {"jlink"})),
    main =
        @MainSpace(
            modules = "*/main/java",
            tweaks = {
              @Tweak(tool = "javac", option = "-encoding", value = "UTF-8"),
              @Tweak(tool = "javac", option = "-g"),
              @Tweak(tool = "javac", option = "-parameters"),
              @Tweak(tool = "javac", option = "-Xlint")
            }),
    libraries =
        @Libraries(
            externalModules = {
              @ExternalModule(
                  link = "org.springframework.boot:spring-boot-starter-webflux:2.4.3",
                  name = "spring.boot.starter.webflux"),
              @ExternalModule(
                  link = "org.springframework.boot:spring-boot-starter-json:2.4.3",
                  name = "spring.boot.starter.json"),
              @ExternalModule(
                  link = "com.fasterxml.jackson.core:jackson-databind:2.11.4",
                  name = "com.fasterxml.jackson.databind"),
              @ExternalModule(
                  link = "com.fasterxml.jackson.core:jackson-annotations:2.11.4",
                  name = "com.fasterxml.jackson.annotation"),
              @ExternalModule(
                  link = "com.fasterxml.jackson.core:jackson-core:2.11.4",
                  name = "com.fasterxml.jackson.core"),
              @ExternalModule(
                  link = "com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.11.4",
                  name = "com.fasterxml.jackson.datatype.jdk8"),
              @ExternalModule(
                  link = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.11.4",
                  name = "com.fasterxml.jackson.datatype.jsr310"),
              @ExternalModule(
                  link = "com.fasterxml.jackson.module:jackson-module-parameter-names:2.11.4",
                  name = "com.fasterxml.jackson.module.paramnames"),
              @ExternalModule(
                  link = "org.springframework.boot:spring-boot-starter-reactor-netty:2.4.3",
                  name = "spring.boot.starter.reactor.netty"),
              @ExternalModule(
                  link = "io.projectreactor.netty:reactor-netty-http:1.0.4",
                  name = "reactor.netty.http"),
              @ExternalModule(
                  link = "io.netty:netty-codec-http:4.1.59.Final",
                  name = "io.netty.codec.http"),
              @ExternalModule(
                  link = "io.netty:netty-common:4.1.59.Final",
                  name = "io.netty.common"),
              @ExternalModule(
                  link = "io.netty:netty-buffer:4.1.59.Final",
                  name = "io.netty.buffer"),
              @ExternalModule(
                  link = "io.netty:netty-transport:4.1.59.Final",
                  name = "io.netty.transport"),
              @ExternalModule(link = "io.netty:netty-codec:4.1.59.Final", name = "io.netty.codec"),
              @ExternalModule(
                  link = "io.netty:netty-handler:4.1.59.Final",
                  name = "io.netty.handler"),
              @ExternalModule(
                  link = "io.netty:netty-codec-http2:4.1.59.Final",
                  name = "io.netty.codec.http2"),
              @ExternalModule(
                  link = "io.netty:netty-resolver-dns:4.1.59.Final",
                  name = "io.netty.resolver.dns"),
              @ExternalModule(
                  link = "io.netty:netty-resolver:4.1.59.Final",
                  name = "io.netty.resolver"),
              @ExternalModule(
                  link = "io.netty:netty-codec-dns:4.1.59.Final",
                  name = "io.netty.codec.dns"),
              @ExternalModule(
                  link = "io.netty:netty-resolver-dns-native-macos:osx-x86_64:4.1.59.Final",
                  name = "io.netty.resolver.dns.macos"),
              @ExternalModule(
                  link = "io.netty:netty-transport-native-unix-common:4.1.59.Final",
                  name = "io.netty.transport.unix.common"),
              @ExternalModule(
                  link = "io.netty:netty-transport-native-epoll:linux-x86_64:4.1.59.Final",
                  name = "io.netty.transport.epoll"),
              @ExternalModule(
                  link = "io.projectreactor.netty:reactor-netty-core:1.0.4",
                  name = "reactor.netty.core"),
              @ExternalModule(
                  link = "io.netty:netty-handler-proxy:4.1.59.Final",
                  name = "io.netty.handler.proxy"),
              @ExternalModule(
                  link = "io.netty:netty-codec-socks:4.1.59.Final",
                  name = "io.netty.codec.socks"),
              @ExternalModule(link = "org.springframework:spring-web:5.3.4", name = "spring.web"),
              @ExternalModule(
                  link = "org.springframework:spring-beans:5.3.4",
                  name = "spring.beans"),
              @ExternalModule(
                  link = "org.springframework:spring-webflux:5.3.4",
                  name = "spring.webflux"),
              @ExternalModule(link = "io.projectreactor:reactor-core:3.4.3", name = "reactor.core"),
              @ExternalModule(
                  link = "org.reactivestreams:reactive-streams:1.0.3",
                  name = "org.reactivestreams"),
              @ExternalModule(
                  link = "org.springframework.boot:spring-boot-starter:2.4.3",
                  name = "spring.boot.starter"),
              @ExternalModule(
                  link = "org.springframework.boot:spring-boot:2.4.3",
                  name = "spring.boot"),
              @ExternalModule(
                  link = "org.springframework:spring-context:5.3.4",
                  name = "spring.context"),
              @ExternalModule(link = "org.springframework:spring-aop:5.3.4", name = "spring.aop"),
              @ExternalModule(
                  link = "org.springframework:spring-expression:5.3.4",
                  name = "spring.expression"),
              @ExternalModule(
                  link = "org.springframework.boot:spring-boot-autoconfigure:2.4.3",
                  name = "spring.boot.autoconfigure"),
              @ExternalModule(
                  link = "jakarta.annotation:jakarta.annotation-api:1.3.5",
                  name = "java.annotation"),
              @ExternalModule(link = "org.springframework:spring-core:5.3.4", name = "spring.core"),
              @ExternalModule(link = "org.springframework:spring-jcl:5.3.4", name = "spring.jcl"),
              @ExternalModule(link = "org.yaml:snakeyaml:1.27", name = "org.yaml.snakeyaml"),
              @ExternalModule(
                  link = "org.springframework.boot:spring-boot-starter-log4j2:2.4.3",
                  name = "spring.boot.starter.log4j2"),
              @ExternalModule(
                  link = "org.apache.logging.log4j:log4j-slf4j-impl:2.13.3",
                  name = "org.apache.logging.log4j.slf4j"),
              @ExternalModule(link = "org.slf4j:slf4j-api:1.7.30", name = "org.slf4j"),
              @ExternalModule(
                  link = "org.apache.logging.log4j:log4j-api:2.13.3",
                  name = "org.apache.logging.log4j"),
              @ExternalModule(
                  link = "org.apache.logging.log4j:log4j-core:2.13.3",
                  name = "org.apache.logging.log4j.core"),
              @ExternalModule(
                  link = "org.apache.logging.log4j:log4j-jul:2.13.3",
                  name = "org.apache.logging.log4j.jul")
            }))
module bach.info {
  requires com.github.sormuras.bach;
}
