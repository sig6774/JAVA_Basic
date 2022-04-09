package Static;

// 객체가 살아있을때만 존재하는 것, 메소드가 실행될때만 존재하는 것, 블럭안에 있을때만 존재하는 것
// 위의 것들 이외에 프로그램이 시작~종료까지 존재하는 것이 있으며 그것이 static 

class A {
	public void g() {
		System.out.println("ggggg");
	}
	
	public static void h() {
		System.out.println("Method h is in A class.");
	}
}

class B{
	public static void h() {
		System.out.println("Method h is in B class.");
	}
}

class cal{
	int a; int b;
	
	int add() {
		return this.a + this.b;
	}
	
	static int add1(int a, int b) {
		return a+b;
	}
}
public class Re_Static_Method {

	public static void main(String[] args) {
		A a1 = new A();
		a1.h();
		A.h();
		// static 메소드는 객체를 만들어서 접근할 수도 있고 클래스에 직접 접근도 가능 
		// 즉, static은 프로그램이 실행될때부터 종료까지 계속 존재한다는 것을 검증 
	
//		A.g();
		a1.g(); // g()는 static 메소드가 아니므로 객체를 만들어야 접근할 수 있음 
		
		B.h(); // B도 마찬가지 
	
		cal c1 = new cal();
		c1.a = 3;
		c1.b = 5;
		System.out.println(c1.add());
		// add()메소드와 a,b는 객체로 만들어졌을때만 접근이 가능
		cal.add1(5, 8);
		// add1()메소드는 static이므로 따로 객체로 만들 필요없이 직접 접근 가능 
	} 
} // static은 상태(값)를 이용 및 변화할 필요가 없을때 사용할 수 있음 
