package 수업;
import java.util.Scanner;
public class ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str = "한글 ABCD efhg";
		
		System.out.println("원 문자열 ==> ["+str + "]");
		System.out.println("대문자 문자열 ==> ["+str.toUpperCase() + "]");
		System.out.println("소문자 문자열 ==> ["+str.toLowerCase() + "]");
		System.out.println("공백제거 문자열 ==> ["+str.trim() + "]");

	}

}
