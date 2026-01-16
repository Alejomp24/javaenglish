package com.perezcasallas.abstractclass;

public abstract class AbstractReceipe {
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();
}
