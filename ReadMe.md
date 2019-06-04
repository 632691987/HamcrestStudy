其实很简单，就是结合 Assert.assertThat

Assert.assertThat("xxxxxdcv", Matchers.endsWith("dcv"));

而所有的 API, 都可以是从 Matchers 的副API 收集出来的。