package Overload;

// remind Override 
interface A{
	void g();
}

class B implements A{
	@Override
	public void g() {
		System.out.println("Override g method.");
	}
}
// 바디가 없는 interface A의 g()를 B 클래스에서 Override 
 
// 부모때에는 순대국을 내장순대국으로 만들고 나는 고기순대국으로 만듬 
class 부모때식당 {
	void 순대국을만들다() {
		System.out.println("내장순대국을 만들다.");
	}
}

class 내식당 extends 부모때식당 {
	@Override 
	void 순대국을만들다() {
		System.out.println("고기순대국을 만들다.");
	}
	// 똑같은 메소드를 추가 및 변경 
	void 족발을만들다() {
		System.out.println("족발을 만들다.");
	}
}

// Overload 
// 같은 이름의 메소드가 여러개 있는 것으로 매개변수 유형이나 개수가 달라짐 
// Method Overload와 Constructor Overload가 존재

// Method Overload 
class h{
	void insert() {
		System.out.println("Nothing");
	}
	
	
	void insert(int no) {
		System.out.println("Insert Number : " + no);
	}
	
	void insert(String st) {
		System.out.println("Insert String : " + st);
	}
	
	void insert(int no, String st) {
		System.out.println("Insert Multi parameter : " + no + st);
	}
}

// Constructor Overload 
class C{
	C() {}
	C(int no) {}
	C(int no, String st) {}
}
public class Re_Override_Overload {

	public static void main(String[] args) {
		부모때식당 부모때식당손님 = new 부모때식당(); 
		부모때식당손님.순대국을만들다();
		
		// Override 이점이 존재하지 않음 
		내식당 내식당손님 = new 내식당();
		내식당손님.순대국을만들다();
		내식당손님.족발을만들다();
		
		
		// Override 이점이 존재 
		부모때식당 부모식당단골손님 = new 내식당();
		부모식당단골손님.순대국을만들다();
		// 내장순대국이 아니라 고기순대국으로 바뀜 
		// Override는 새롭게 변화를 주는 것 
		
		// Overload 
		h h1 = new h();
		h1.insert();
		h1.insert(3);
		h1.insert("er");
		h1.insert(3, "er");
	}

}
