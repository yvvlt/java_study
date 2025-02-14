package pack2;

/*import pack1.Car;*/

public class Sedan extends pack1.Car {
	Sedan() {
		System.out.println("패키지2의 Sedan 생성자입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan();
		System.out.println(Car.CAR_NAME);
		
		System.out.println(pack1.Car.CAR_NAME);

	}

}
