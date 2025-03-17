public class Problem_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] array = new int [10][10][10];
		int i,j,k;
		int index = 1, hap = 0;
		
		for(i=0;i<10;i++)
			for(j=0;j<10;j++)
				for(k=0;k<10;k++)
					array[i][j][k] = index++;
		
		for(i=0;i<10;i++)
			for(j=0;j<10;j++)
				for(k=0;k<10;k++)
					hap += array[i][j][k];
		
		System.out.printf("1~1000까지 합계 : %d",hap);
	}

}
