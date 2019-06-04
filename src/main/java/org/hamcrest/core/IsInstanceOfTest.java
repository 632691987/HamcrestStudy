package org.hamcrest.core;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class IsInstanceOfTest {

  @Test
  public void evaluatesToTrueIfArgumentIsInstanceOfASpecificClass() {
    final Matcher<Object> matcher = Matchers.instanceOf(Number.class);
    Assert.assertTrue(matcher.matches(1));
    Assert.assertTrue(matcher.matches(1.1));
    Assert.assertFalse(matcher.matches(null));
    Assert.assertFalse(matcher.matches(new Object()));
  }

  @Test
  public void matchesPrimitiveTypes() {
    Assert.assertTrue(Matchers.any(boolean.class).matches(true));
    Assert.assertTrue(Matchers.any(byte.class).matches((byte)1));
    Assert.assertTrue(Matchers.any(char.class).matches('x'));
    Assert.assertTrue(Matchers.any(double.class).matches(5.0));
    Assert.assertTrue(Matchers.any(float.class).matches(5.0f));
    Assert.assertTrue(Matchers.any(int.class).matches(2));
    Assert.assertTrue(Matchers.any(long.class).matches(4L));
    Assert.assertTrue(Matchers.any(short.class).matches((short) 1));
  }
}
