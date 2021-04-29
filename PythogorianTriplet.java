package pepcodingQuestions;
import java.util.*;

public class PythogorianTriplet {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = (a * a + b * b + c * c);
		int max = Math.max(a, Math.max(b, c));
		if(sum - (max * max) == max * max)
			System.out.println("true");
		else
			System.out.println("false");
		sc.close();
	}

}
