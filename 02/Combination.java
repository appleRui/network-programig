public class Combination {

	public static void main(String[] args) {
		int n = 4;
		int r = 2;
		long result = 1;

    for (int i = 1; i <= r; i++) {
        result = result * (n - i + 1) / i;
    }
    System.out.println(result);
	}
}