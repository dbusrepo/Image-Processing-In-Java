package imageprocessing;

import base.graphics.app.GraphApp;
import base.graphics.app.Settings;

public class Main extends GraphApp {

	public Main() throws Exception {
		Settings settings = new Settings();
		settings.title = "Hello Image Processing!";
		start(settings);
	}

	public static void main(String[] args) throws Exception {
		new Main();
	}

	@Override
	public void initApp() {
	}

	@Override
	public void updateApp(long elapsedTime) {
	}

	@Override
	public void finishOffApp() {
	}

	@Override
	public void printFinalStatsApp() {
	}

}
