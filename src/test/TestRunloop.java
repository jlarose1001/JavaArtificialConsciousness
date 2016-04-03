package test;

import javax.swing.SwingUtilities;

import com.util.Task;
import com.util.TaskScheduler;

public class TestRunloop implements Runnable {
	
	public TestRunloop() {
		run();
	}

	public static void main(String[] arg0) {
		SwingUtilities.invokeLater(new TestRunloop());
	}

	@Override
	public void run() {
		@SuppressWarnings("resource")
		TaskScheduler sc = new TaskScheduler();
		sc.put(new Task());
		sc.put(new Task());
		sc.put(new Task());
		sc.put(new Task());
		for (Task object : sc) {
			System.out.println(object.id.toString());
		}
	}

}
