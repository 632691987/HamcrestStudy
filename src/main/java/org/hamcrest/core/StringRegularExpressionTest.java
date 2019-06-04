package org.hamcrest.core;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;


public class StringRegularExpressionTest {

  @Test
  public void testMatchingRegex() {
    Assert.assertThat("1", Matchers.matchesRegex("^[0-9]+$"));
  }
}
