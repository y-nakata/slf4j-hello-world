import java.io.IOException;
import java.util.logging.LogManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	static  {
		configureJdk14Logger();
	}
	
	private static void configureJdk14Logger() {
		try {
			LogManager.getLogManager().readConfiguration(HelloWorld.class.getResourceAsStream("logging.properties"));
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloWorld.class);
		logger.info("Hello World");
	}
}
