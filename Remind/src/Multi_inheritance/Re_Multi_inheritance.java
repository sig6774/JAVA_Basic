package Multi_inheritance;

// 다중상속 : interface만 가능 

interface 생산캐릭터{
	public int 생산하다();
}

interface 공격캐릭터 {
	public void 공격하다();
}

// scv 생각 (생산, 공격 모두 가능)
class 주민 implements 생산캐릭터, 공격캐릭터{
	@Override 
	public int 생산하다() {
		int 자원 = 5;
		System.out.println(자원 + " 생산합니다. ");
		return 자원;
	}
	
	@Override
	public void 공격하다() {
		System.out.println("주민은 공격할 수 있습니다.");
	}
}

class 마린 implements 공격캐릭터 {
	@Override 
	public void 공격하다() {
		System.out.println("마린은 공격을 할 수 있습니다.");
	}
}

public class Re_Multi_inheritance {

	public static void main(String[] args) {
		주민 주민1 = new 주민();
		마린 마린1 = new 마린();
		주민1.공격하다();
		주민1.생산하다();
		마린1.공격하다();
	}

}
