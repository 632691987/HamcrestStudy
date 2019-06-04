package org.hamcrest.beans;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.beans.HasProperty.hasProperty;

public class HasPropertyTest {

  private final BeanObject bean = new BeanObject("a bean", false);

  @Test
  public void matchesWhenThePropertyExists() {
    Matcher<String> matcher = hasProperty("property2");
    Assert.assertTrue(matcher.matches(bean));

    Assert.assertThat(bean, hasProperty("property2"));
  }
}
