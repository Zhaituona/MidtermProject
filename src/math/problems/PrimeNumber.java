package math.problems;

public class PrimeNumber {



	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		// using nesed loop
		for (int i = 2; i <= 1000000; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
				}
				if (j % i == 0) {
					break;
				}

			}


		}

	}
}
