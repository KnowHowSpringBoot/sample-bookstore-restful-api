package dev.knowhowto.bookstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookstoreApplicationTest {

  @Test
  void contextLoad() {
    Assertions.assertDoesNotThrow(this::doNotThrowException);
  }

  private void doNotThrowException() {
    // This method will never throw exception
  }
}
