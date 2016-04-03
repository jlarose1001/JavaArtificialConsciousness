package test;

import javax.swing.SwingUtilities;

public class TestRunloop implements Runnable {
	
	public TestRunloop() {
		run();
	}

	public static void main(String[] arg0) {
		SwingUtilities.invokeLater(new TestRunloop());
	}

	@Override
	public void run() {

	}

}
