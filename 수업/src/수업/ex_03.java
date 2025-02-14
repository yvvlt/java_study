package 수업;
import java.util.Scanner;
public class ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int a,b;
		char ch;
		
		System.out.println("첫번째 수를 입력하세요 : ");
		a = s.nextInt();
		
		System.out.println("계산할 연산자를 입력하세요 : ");
		ch = s.next().charAt(0);
		
		System.out.println("두번째 수를 입력하세요 : ");
		b = s.nextInt();
		
		if(ch=='+')
			System.out.printf("%d + %d = %d 입니다.\n",a,b,a+b);
		else if(ch=='-')
			System.out.printf("%d - %d = %d 입니다.\n",a,b,a-b);
		else if(ch=='*')
			System.out.printf("%d + %d = %d 입니다.\n",a,b,a*b);
		else if(ch=='/')
			System.out.printf("%d + %d = %d 입니다.\n",a,b,a/(float)b);
		else if(ch=='%')
			System.out.printf("%d + %d = %d 입니다.\n",a,b,a%b);
		else
			System.out.printf("연산자를 잘못 입력했습니다.\n");

	}
}