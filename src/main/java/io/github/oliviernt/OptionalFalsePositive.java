package io.github.oliviernt;

import java.util.Optional;

public class OptionalFalsePositive {

  public String optionalWithAssertionOnIsPreset() {

    Optional<String> stringOptional = Optional.ofNullable("test");

    Assertions.state(stringOptional.isPresent());

    return stringOptional.get();
  }

}
