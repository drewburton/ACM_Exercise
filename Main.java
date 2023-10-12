class Main {
	public static void main(String... args) {
		// fix the following code to print the pattern
		/*
			*
			**
			***
			****
		*/

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}