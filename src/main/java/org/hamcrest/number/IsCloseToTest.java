package org.hamcrest.number;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;

public class IsCloseToTest {

  @Test
  public void testCloseTo() {
    Assert.assertThat(1.0, closeTo(1.0d, 0.5d));
  }
}
