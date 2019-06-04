package org.hamcrest.core;

import com.google.common.base.Objects;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class AllOfTest {

  @Test
  public void testAllOfString() {
    Matcher<String> matcher = Matchers.allOf(Matchers.startsWith("DEF"), Matchers.endsWith("IDJ"));

    Assert.assertFalse(matcher.matches("ABC"));
    Assert.assertFalse(matcher.matches("DEF"));
    Assert.assertTrue(matcher.matches("DEFIDJ"));

    Assert.assertThat("DEFIDJ", matcher);
  }

  @Test
  public void testAllOfObject() {
    Matcher<AnyOfTestEntity> matcher = Matchers.allOf(Matchers.equalTo(new AllOfTestEntity("ABC", 18)));
    Assert.assertTrue(matcher.matches(new AllOfTestEntity("ABC", 18)));
    Assert.assertFalse(matcher.matches(new AllOfTestEntity("DEF", 20)));
  }
}

class AllOfTestEntity {
  private String aProperty;
  private int age;

  public AllOfTestEntity(String aProperty, int age) {
    this.aProperty = aProperty;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AllOfTestEntity that = (AllOfTestEntity) o;
    return age == that.age && Objects.equal(aProperty, that.aProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(aProperty, age);
  }
}
