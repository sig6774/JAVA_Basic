package Abstract;

/*
- interface : 추상적인 것만 있는 설명서 
- class : 온전한 설명서 
- abstract : interface와 class의 특징을 반반 가지고 있을 수 있는 class이며 추상적인 것과 온전한 것이 섞여 있을 수 있는 것 
			 추상적인 메소드에는 abstract라고 표기 
- interface와 abstract는 추상적으로 표현하고 있으므로 객체로 만들수 없음 
 */

abstract class A{
	abstract void g();
	// 추상적 메소드 작성 
	
	void h() {
		System.out.println("full method");
		// 온전한 메소드도 작성 가능 
	}
}
class B extends A{
	@Override 
	void g() {
		System.out.println("B class is extended A class of abstract g method.");
	}
}
public class Re_Abstract {

	public static void main(String[] args) {
		B b1 = new B();
		b1.g();
		b1.h();
		// abstract는 추상적인 메소드를 override해서 온전하게 만들 수 있고 그냥 온전하게 메소드를 작성할 수도 있음 
	}

}
