package org.hamcrest.text;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class IsBlankStringTest {

  @Test
  public void matchesEmptyString() {
    Assert.assertThat("", Matchers.blankOrNullString());
    Assert.assertThat("", Matchers.blankString());
  }
}
