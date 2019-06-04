package org.hamcrest.number;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.number.BigDecimalCloseTo.closeTo;

public class BigDecimalCloseToTest {

  @Test
  public void testEvaluatesToTrueIfArgumentHasDifferentScale() {
    Assert.assertThat(new BigDecimal("1.500000"), closeTo(new BigDecimal("1.0"), new BigDecimal("0.5")));
  }
}
