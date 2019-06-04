package org.hamcrest.core;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class StringStartsWithTest {

  @Test
  public void testStartsWith() {
    Assert.assertThat("STARTTTTT", Matchers.startsWith("START"));
  }

  @Test
  public void testStartsWithIgnoringCase() {
    Assert.assertThat("STARTTTTT", Matchers.startsWithIgnoringCase("start"));
  }
}
