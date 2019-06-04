package org.hamcrest.io;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.core.IsEqual.equalTo;

public class FileMatchersTest {

  private File directory;
  private File file;

  @Before
  public void setUp() throws IOException {
    directory = File.createTempFile("myDir", "");
    directory.delete();
    directory.mkdirs();
    file = new File(directory, "myFile");
    file.createNewFile();
  }

  @After
  public void after() {
    file.delete();
    directory.delete();
  }

  @Test
  public void testAnExistingDirectory() {
    Assert.assertThat(directory, FileMatchers.anExistingDirectory());
  }

  @Test
  public void testAFileWithSizeMatcherOfLong() {
    Assert.assertThat(file, FileMatchers.aFileWithSize(equalTo(0L)));
  }

  @Test
  public void testAFileNamed() {
    Assert.assertThat(file, FileMatchers.aFileNamed(equalTo(file.getName())));
  }
}
