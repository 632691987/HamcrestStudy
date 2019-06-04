package org.hamcrest.text;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public final class IsEmptyStringTest {

  @Test
  public void matchesEmptyString() {
    Assert.assertThat("", Matchers.emptyOrNullString());
    Assert.assertThat("", Matchers.emptyString());
  }
}
