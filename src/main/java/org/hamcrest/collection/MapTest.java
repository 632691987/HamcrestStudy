package org.hamcrest.collection;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

  @Test
  public void testHasKey() {
    Matcher matcher = Matchers.hasKey("a");

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);

    Assert.assertTrue(matcher.matches(map));
  }

  @Test
  public void testHasValue() {
    Matcher matcher = Matchers.hasValue(1);

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);

    Assert.assertTrue(matcher.matches(map));
  }

  @Test
  public void testHasEntry() {
    Matcher matcher = Matchers.hasEntry(Matchers.equalTo("a"), Matchers.equalTo(1));

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);

    Assert.assertTrue(matcher.matches(map));
  }

  @Test
  public void testAMapWithSize() {
    Matcher matcher = Matchers.aMapWithSize(1);

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);

    Assert.assertTrue(matcher.matches(map));
  }
}
