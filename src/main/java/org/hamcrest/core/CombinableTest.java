package org.hamcrest.core;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class CombinableTest {

  @Test
  public void testIntegerEitherCompare() {
    Matcher<Integer> RULE1 = Matchers.either(Matchers.equalTo(3)).or(Matchers.equalTo(4));
    Assert.assertTrue(RULE1.matches(3));
    Assert.assertTrue(RULE1.matches(4));
  }

  @Test
  public void testIntegerBothCompare() {
    Matcher<Integer> RULE1 = Matchers.both(Matchers.greaterThan(3)).and(Matchers.lessThan(5));
    Assert.assertTrue(RULE1.matches(4));
  }

  @Test
  public void testOjectEitherCompare() {
    Matcher<CombinableTestEntity> RULE1 =
        Matchers.either(Matchers.greaterThan(new CombinableTestEntity("AVC", 30)))
            .or(Matchers.lessThan(new CombinableTestEntity("", 15)));
    Assert.assertTrue(RULE1.matches(new CombinableTestEntity("", 31)));
    Assert.assertTrue(RULE1.matches(new CombinableTestEntity("", 14)));
    Assert.assertFalse(RULE1.matches(new CombinableTestEntity("", 20)));
  }

  @Test
  public void testOjectBothCompare() {
    Matcher<CombinableTestEntity> RULE1 =
        Matchers.both(Matchers.lessThan(new CombinableTestEntity("AVC", 30)))
            .and(Matchers.greaterThan(new CombinableTestEntity("", 18)));
    Assert.assertTrue(RULE1.matches(new CombinableTestEntity("", 25)));
    Assert.assertFalse(RULE1.matches(new CombinableTestEntity("", 35)));
    Assert.assertFalse(RULE1.matches(new CombinableTestEntity("", 15)));
  }
}

class CombinableTestEntity implements Comparable<CombinableTestEntity> {
  private String aProperty;
  private int age;

  public CombinableTestEntity(String aProperty, int age) {
    this.aProperty = aProperty;
    this.age = age;
  }

  @Override
  public int compareTo(CombinableTestEntity other) {
    if (this.age > other.age) {
      return 1;
    } else if (this.age == other.age) {
      return 0;
    } else {
      return -1;
    }
  }
}
