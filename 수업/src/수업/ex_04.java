package 수업;
import java.io.IOException;
import java.util.Scanner;
public class ex_04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a,b;
		char ch;
		
		while (true) {
			System.out.println("첫번째 수 입력");
			a=s.nextInt();
			
			System.out.println("두번째 수 입력");
			b=s.nextInt();
			
			System.out.println("연산자 입력");
			ch=(char)System.in.read();
			
			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d 입니다.\n",a,b,a+b); break;
			case '-':
				System.out.printf("%d - %d = %d 입니다.\n",a,b,a-b); break;
			case '*':
				System.out.printf("%d * %d = %d 입니다.\n",a,b,a*b); break;
			case '/':
				System.out.printf("%d / %d = %d 입니다.\n",a,b,a/(float)b); break;
			case '%':
				System.out.printf("%d %% %d = %d 입니다.\n",a,b,a%b); break;
			default:
				System.out.println("연산자를 잘못 입력했습니다.\n");
			}
			
			
		}
	}

}
