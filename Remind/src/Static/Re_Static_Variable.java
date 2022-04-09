package Static;
// 어떤 클래스의 객체를 여러개 만들어도 그 객체들이 모두 공유되는 변수가 static variable

class A1{
	static int v;
	int w;
}
public class Re_Static_Variable {

	public static void main(String[] args) {
		A1.v = 3;
		A1 a1 = new A1();
		A1 a2 = new A1();
		System.out.println(a1.v);
		System.out.println(a2.v);
		// 어떤 객체라도 static 변수인 v의 값은 바뀌지 않음 
		
		a1.v = 9; 
		a2.v = 10;
		System.out.println(a1.v);
		// 마지막으로 v를 10으로 지정했기 때문에 객체 a1의 v도 10 
		
		a1.w = 32;
		a2.w = 18;
		System.out.println(a1.w);
		System.out.println(a2.w);
		// 객체범위의 변수인 w는 각 객체마다 값이 다름 
	}
} // 객체들에 영향을 받지 않는 특별하게 바뀔 필요가 없는 변수를 static으로 지정해서 이용하면 좋을듯 
