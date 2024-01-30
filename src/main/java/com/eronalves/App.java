package com.eronalves;

import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {

  private static class Pair<L, R> {
    public final L left;
    public final R right;

    public Pair(L left, R right) {
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      return "Pair{left=" + left + ", right=" + right + "}";
    }

  }

  public static void main(String[] args) {
    Stream
        .iterate(new Pair<>(0, 1),
            p -> new Pair<>(p.left + p.right, p.left + p.right * 2))
        .limit(20)
        .forEach(System.out::println);
  }

}
