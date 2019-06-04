package org.hamcrest.core;

import com.google.common.base.Objects;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class AnyOfTest {

    @Test
    public void testAnyOfString() {
        Matcher<String> matcher = Matchers.anyOf(Matchers.startsWith("ABC"), Matchers.endsWith("DEF"));

        Assert.assertTrue(matcher.matches("ABC111"));
        Assert.assertTrue(matcher.matches("111DEF"));
        Assert.assertTrue(matcher.matches("ABCDEF"));
    }

    @Test
    public void testAnyOfObject() {
        Matcher<AnyOfTestEntity> matcher = Matchers.anyOf(
                Matchers.equalTo(new AnyOfTestEntity("ABC", 18)),
                Matchers.nullValue(),
                Matchers.equalTo(new AnyOfTestEntity("DEF", 20)));

        Assert.assertTrue(matcher.matches(new AnyOfTestEntity("ABC", 18)));
        Assert.assertTrue(matcher.matches(null));
        Assert.assertTrue(matcher.matches(new AnyOfTestEntity("DEF", 20)));
    }
}

class AnyOfTestEntity {
    private String aProperty;
    private int age;

    public AnyOfTestEntity(String aProperty, int age) {
        this.aProperty = aProperty;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnyOfTestEntity that = (AnyOfTestEntity) o;
        return age == that.age && Objects.equal(aProperty, that.aProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(aProperty, age);
    }
}