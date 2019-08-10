import java.io.IOException;
import java.util.logging.LogManager;

public class Utils {
	public static void configureJdk14Logger() {
		try {
			LogManager.getLogManager().readConfiguration(HelloWorld.class.getResourceAsStream("logging.properties"));
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}

}
