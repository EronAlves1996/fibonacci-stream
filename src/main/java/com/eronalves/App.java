package com.eronalves;

import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    Stream.iterate(0, a -> 1)
        .limit(20)
        .forEach(System.out::println);
  }
}
