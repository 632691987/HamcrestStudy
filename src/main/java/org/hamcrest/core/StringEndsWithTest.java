package org.hamcrest.core;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class StringEndsWithTest {

  @Test
  public void testMatchesSubstringAtEnd() {
    Assert.assertThat("xxxxxdcv", Matchers.endsWith("dcv"));
  }
}
