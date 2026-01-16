package com.perezcasallas;

class DefaultClass {

}

public class NestedClassRunner {

	int i;
	static int j = 12;

	class InnerClass {
		public void method() {
			i = 5;
		}
	}

	static class StaticNestedClass {

	}

	public static void main(String[] args) {
		StaticNestedClass staticNestedClass = new StaticNestedClass();

		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
	}
}
