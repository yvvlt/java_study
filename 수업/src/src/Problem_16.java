import java.util.Scanner;
public class Problem_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		int str_cnt;
		int i;
		
		System.out.printf("글자를 입력 : ");
		str = s.nextLine();
		
		System.out.printf("\n");
		System.out.printf("입력한 문자열 ==> %s\n");
		System.out.printf("변환된 문자열 ==> ");
		
		str_cnt = str.length();
		
		for(i=str_cnt-1;i>=0;i--) {
			System.out.printf("%c",str.charAt(i));
		}
	}

}
