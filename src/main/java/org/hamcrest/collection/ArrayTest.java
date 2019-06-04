package org.hamcrest.collection;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

  /** #Order */
  @Test
  public void testArrayContainingInAnyOrder() {
    Matcher<Integer[]> matcher = ArrayMatching.arrayContainingInAnyOrder(1, 2, 3);
    Assert.assertTrue(matcher.matches(new Integer[] {1, 2, 3}));
    Assert.assertTrue(matcher.matches(new Integer[] {3, 2, 1}));
    ArrayMatching.hasItemInArray(10);
  }

  /** #Order */
  @Test
  public void testArrayContainingInOrder() {
    Matcher<Integer[]> matcher = ArrayMatching.arrayContaining(1, 2, 3);
    Assert.assertTrue(matcher.matches(new Integer[] {1, 2, 3}));
    Assert.assertFalse(matcher.matches(new Integer[] {3, 2, 1}));
  }

  /** #Order */
  @Test
  public void testArrayContainingInOrder2() {
    Matcher<Integer[]> matcher =
        ArrayMatching.arrayContaining(
            Matchers.equalTo(1), Matchers.equalTo(2), Matchers.equalTo(3));
    Assert.assertTrue(matcher.matches(new Integer[] {1, 2, 3}));
    Assert.assertFalse(matcher.matches(new Integer[] {3, 2, 1}));
  }

  /** #Item */
  @Test
  public void testHasItemInArray() {
    Matcher<String[]> matcher = ArrayMatching.hasItemInArray("a");
    Assert.assertTrue(matcher.matches(new String[] {"a", "b", "c"}));
  }

  /** #Item compare */
  @Test
  public void testHasItemInArrayAndLessThan() {
    Matcher<Integer[]> matcher = ArrayMatching.hasItemInArray(Matchers.lessThan(4));
    Assert.assertTrue(matcher.matches(new Integer[] {3, 5, 6}));
  }

  /** #Size */
  @Test
  public void testArrayWithSize() {
    Matcher<Integer[]> matcher = Matchers.arrayWithSize(Matchers.equalTo(3));
    Assert.assertTrue(matcher.matches(new Integer[] {1, 2, 3}));
  }

  /** #Size */
  @Test
  public void testArrayWithSizeAndLessThan() {
    Matcher<Integer[]> matcher = Matchers.arrayWithSize(Matchers.lessThan(3));
    Assert.assertTrue(matcher.matches(new Integer[] {1, 2}));
  }

  @Test
  public void testHasSize() {
    Matcher<?> matcher = Matchers.hasSize(2);
    Assert.assertTrue(matcher.matches(Arrays.asList(1, 2)));
  }

  @Test
  public void testArrayEmpty() {
    Matcher matcher = Matchers.emptyArray();
    Assert.assertTrue(matcher.matches(new Integer[]{}));
  }

  @Test
  public void testCollectionEmpty() {
    Matcher matcher = Matchers.empty();
    Assert.assertTrue(matcher.matches(Arrays.asList()));
  }

  @Test
  public void testIterableWithSize() {
    Matcher<?> matcher = Matchers.iterableWithSize(0);
    Assert.assertTrue(matcher.matches(Arrays.asList()));
  }
}
