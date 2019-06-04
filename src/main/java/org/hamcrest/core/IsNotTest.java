package org.hamcrest.core;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

public class IsNotTest {

  @Test
  public void testNOT() {
    final Matcher<String> matcher = not(equalTo("A"));

    Assert.assertTrue(matcher.matches("B"));
    Assert.assertFalse(matcher.matches("A"));
  }
}
