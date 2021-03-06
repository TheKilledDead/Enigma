package cuchaz.enigma.command;

import org.junit.Test;

import java.io.File;

public class CheckMappingsCommandTest {

	@Test(expected = IllegalStateException.class)
	public void testWrong() throws Exception {
		new CheckMappingsCommand().run(new File("build/test-obf/packageAccess.jar").getAbsolutePath(), new File("src/test/resources" +
				"/packageAccess/wrongMappings").getAbsolutePath());
	}

	@Test
	public void testRight() throws Exception {
		new CheckMappingsCommand().run(new File("build/test-obf/packageAccess.jar").getAbsolutePath(), new File("src/test/resources" +
				"/packageAccess/correctMappings").getAbsolutePath());
	}
}
