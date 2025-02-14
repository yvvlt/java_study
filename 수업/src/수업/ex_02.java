package 수업;

class Pet {
	private String type;
	private int age;
	static int count = 0;
	
	Pet(String type, int age){
		this.type = type;
		this.age = age;
	}
	
	static int getCount() {
		return count;
	}
	
	public void move() {
		System.out.println(this.type+"가 움직입니다.");
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getAge() {
		return this.age;
	}
}
public class ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet1 = new Pet("강아지",8);
		Pet.count++;
		Pet pet2 = new Pet("고양이",13);
		Pet.count++;
		
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.getType()+"는 "+pet1.getAge()+"개월입니다.");
		System.out.println(pet2.getType()+"는 "+pet2.getAge()+"개월입니다.");
		
		
		System.out.println("현재 우리집 애완동물 수는 "+Pet.getCount()+"마리 입니다.");
	}

}
