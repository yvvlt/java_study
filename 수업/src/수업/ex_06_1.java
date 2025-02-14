package 수업;

public class ex_06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer s[] = {9,3,7,2,5};
		int i,j;
		
		System.out.println("정렬 전 ==> ");
		for(i=0;i<5;i++) {
			System.out.print(s[i]+" ");
		}
		
		for(i=0;i<5;i++) {
			for(j=0;j<4;j++) {
				if(s[i]<s[j]) {
					int a = s[i];
					s[i]=s[j];
					s[j]=a;
				}
			}
		}
		System.out.println("\n정렬 후 ==> ");
		for(i=0;i<5;i++) {
			System.out.print(s[i]+" ");
		}

	}

}
