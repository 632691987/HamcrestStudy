package org.hamcrest.core;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public final class IsSameTest {

  @Test
  public void testSameInstance() {
    Object o1 = new Object();
    Matcher<Object> matcher = Matchers.sameInstance(o1);

    Assert.assertTrue(matcher.matches(o1));
    Assert.assertFalse(matcher.matches(new Object()));
  }
}
