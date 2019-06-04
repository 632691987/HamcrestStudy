package org.hamcrest.core;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class StringContainsTest {

  @Test
  public void testMatchesSubstrings() {
    Assert.assertThat("DBC", Matchers.containsString("ADBCSSS"));
    Assert.assertThat("DBC", Matchers.containsStringIgnoringCase("adbcDDD"));
  }
}
