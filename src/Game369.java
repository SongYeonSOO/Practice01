
public class Game369 {
	public static void main(String[] args) {
		for(int i=1;i<100;i++){
			String num = String.valueOf(i);
			int length = num.length();
			int count =0;
			switch(length){
			case 1:
				if(num.charAt(0) =='3' ) count++;
				if(num.charAt(0) =='6' ) count++;
				if(num.charAt(0) =='9' ) count++;
				break;
			case 2:
				if(num.charAt(0) =='3' ) count++;
				if(num.charAt(0) =='6' ) count++;
				if(num.charAt(0) =='9' ) count++;				
				if(num.charAt(1) =='3' ) count++;
				if(num.charAt(1) =='6' ) count++;
				if(num.charAt(1) =='9' ) count++;				break;
			}
			if(count == 1){
			System.out.println(num+" 짝");
			}
			else if(count ==2){
				System.out.println(num+" 짝짝");
			}
		}
	}
}
