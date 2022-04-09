package Final;

// 변화가 더이상 없는 것이라고 생각 
// final이 있으면 변수는 값이 변화X, 메소드에는 오버라이딩 X, 클래스에는 상속(포함)X

class A2{
	void g() {
		System.out.println("g method is in A2 class.");
	}
	final void e() {
		System.out.println("Final e method is in A2 class.");
	}
}

class B2 extends A2{
	@Override 
	void g() {
		System.out.println("g method is in B2 class that extends A2 class.");
	}
	
//	@Override
//	void e() {
//		System.out.println("Final is not extends.");
//	}
	// final method인 e()는 메소드를 Override 할 수 없다는 것을 증명 
}

final class C{}
//final D extends C{} 
// final class인 C는 상속을 할 수 없다는 것을 증명 
public class Re_Final {

	public static void main(String[] args) {
		int a = 7; 
		a = 12;
		System.out.println(a);
		
		final int b = 8;
//		b = 10; 
		// final 변수인 b는 상태 변경 불가 
		
		A2 a1 = new A2(); 
		a1.e();
		B2 b1 = new B2();
		b1.e();
		b1.g();
		// 상속받은 e를 Override하는 것은 불가능하지만 그대로 불러오는 것은 가능 
	}
}
