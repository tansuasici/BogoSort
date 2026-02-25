import java.util.Random;

public class BogoSort {

	public static void main(String[] args) {
		int[] numbers = {58, 56, 2, 30, 7, 40};
		bogoSort(numbers);
	}

	public static void bogoSort(int[] numbers) {
		Random rnd = new Random();
		while (true) {
			boolean sorted = true;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					sorted = false;
					break;
				}
			}
			if (sorted) {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < numbers.length; i++) {
					sb.append(numbers[i]);
					if (i < numbers.length - 1)
						sb.append(", ");
				}
				System.out.println(sb.toString());
				return;
			}
			for (int i = numbers.length - 1; i > 0; i--) {
				int rand = rnd.nextInt(i + 1);
				int temp = numbers[i];
				numbers[i] = numbers[rand];
				numbers[rand] = temp;
			}
		}
	}
}
