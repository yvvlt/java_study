public class Problem_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i=0;i<128;i++) {
			if(i%16==0) {
				System.out.printf("____________________\n");
				System.out.printf("10진수     16진수     문자\n");
				System.out.printf("____________________\n");
			}
			System.out.printf("%5d %5x %5c\n",i,i,i);
		}
		
	}
}
