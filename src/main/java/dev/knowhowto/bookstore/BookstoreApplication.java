package dev.knowhowto.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class BookstoreApplication {
  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(BookstoreApplication.class);
    springApplication.setApplicationStartup(new BufferingApplicationStartup(2048));
    springApplication.run(args);
  }
}
