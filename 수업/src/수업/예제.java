package 수업;

class Calc {
	void addValue (double v1, double v2) {
		System.out.println("double값 계산 ==> "+(v1+v2));
	}
	void addValue (int v1, int v2) {
		System.out.println("int값 계산 ==> "+(v1+v2));
	}
}
	
public class 예제 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc myCalc = new Calc();
		
		myCalc.addValue(1.0, 1.0);
		myCalc.addValue(1, 1);
	}
}
		
		