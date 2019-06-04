package org.hamcrest.comparator;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class NormalCompareTest {

  @Test
  public void testComparesObjectsForGreaterThan() {
    assertThat(2, Matchers.greaterThan(1));
    assertThat(0, Matchers.not(Matchers.greaterThan(1)));
  }

  @Test
  public void testLessThan() {
    assertThat(2, Matchers.lessThan(3));
    assertThat(0, Matchers.lessThan(1));
  }

  @Test
  public void testComparesEqualTo() {
    assertThat(3, Matchers.comparesEqualTo(3));
    assertThat("aa", Matchers.comparesEqualTo("aa"));
  }

  @Test
  public void testAllowsForInclusiveComparisons() {
    assertThat("less", 1, Matchers.lessThanOrEqualTo(1));
    assertThat("greater", 1, Matchers.greaterThanOrEqualTo(1));
  }

  @Test
  public void testGreaterThan() {
    assertThat(1.1, Matchers.greaterThan(1.0));
    assertThat("cc", Matchers.greaterThan("bb"));
  }
}
