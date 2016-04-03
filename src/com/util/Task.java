package com.util;

import java.util.UUID;

public class Task extends Thread implements Comparable<Task> {

	public final Byte[][] values;
	public final UUID id;

	public Task after, before;

	public Task() {
		values = new Byte[][] { new Byte[] {}, new Byte[] {}, new Byte[] {}, new Byte[] {} };
		id = new UUID(Init.taskId, Init.taskId);
		Init.taskId++;
	}

	@Override
	public int compareTo(Task arg0) {
		return 0;
	}

	@Override
	public void start() {
		super.start();
	}

	@Override
	public void run() {
		super.run();
	}

}
