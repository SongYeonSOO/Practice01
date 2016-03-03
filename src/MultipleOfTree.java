import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		System.out.print("수를 입력하시오 : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num%3 ==0){
			System.out.println("3의배수입니다.");
		}
		else System.out.println("3의배수가 아닙니다.");
	}

}
