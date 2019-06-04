package org.hamcrest.number;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public final class IsNanTest {

  @Test
  public void matchesNaN() {
    Assert.assertThat(Double.NaN, Matchers.notANumber());
  }
}
