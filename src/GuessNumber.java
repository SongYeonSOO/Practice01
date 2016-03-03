import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int count = 1;
		int a = 1;
		int b = 100;
		
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		while (true) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println(a + "-" + b);
			System.out.print(count + ">>");
			count++;
			int ansnum = scanner.nextInt();

			if (ansnum > k) {
				b = ansnum;
				System.out.println("더낮게");
				continue;
			} else if (ansnum < k) {
				a = ansnum;
				System.out.println("더높게");
				continue;
			} else {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)");
				String answer = scanner.next();
				if (answer.equals("n")) {
					scanner.close();
					break;
				}
				r = new Random();
				k = r.nextInt(100) + 1;
				a = 1;
				b = 100;
				
			}
			}
		}
	}

