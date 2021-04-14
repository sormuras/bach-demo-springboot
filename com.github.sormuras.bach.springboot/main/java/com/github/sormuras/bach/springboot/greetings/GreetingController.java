package com.github.sormuras.bach.springboot.greetings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public final class GreetingController {

  private final AtomicReference<String> greeting;

  public GreetingController(@Value("${app.greeting}") String defaultGreeting) {
    this.greeting = new AtomicReference<>(defaultGreeting);
  }

  @GetMapping({"", "/{name}"})
  public Mono<String> greeting(@PathVariable Optional<String> name) {
    return Mono.justOrEmpty(
        name.or(() -> Optional.of("Word")).map(n -> "%s, %s!\n".formatted(greeting, n)));
  }

  @PutMapping("/greeting")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void updateGreeting(@RequestBody Greeting greeting) {
    this.greeting.set(greeting.value);
  }

  public static final class Greeting {

    private final String value;

    @JsonCreator
    public Greeting(@JsonProperty("greeting") String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }
}
