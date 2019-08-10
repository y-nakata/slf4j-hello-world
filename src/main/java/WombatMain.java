public class WombatMain {

	static {
		Utils.configureJdk14Logger();
	}

	public static void main(String[] args) {
		final Wombat wombat = new Wombat();
		wombat.setTemperature(10);
		wombat.setTemperature(60);
	}

}
