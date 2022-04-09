package Try_catch;

// 상황에 따라 직접 예외처리 방법을 만드는 경우 

class Myexception extends Exception{
	public Myexception(String m) {
		super(m);
		// Exception클래스를 상속(포함)받아서 Exception 생성자 중 String의 내용을 보여줌 
		// super는 Exception을 뜻하고 상속된 클래스를 뜻함 
	}
}

class Calculation1{
	public void divide(int no1, int no2) throws Myexception{// 내가 정의한 예외 클래스로 예외 처리 
		// 예외상황을 표현하는 것 
		if (no2 == 0) {
			throw new Myexception("zero is not divided1");
			// 예외가 발생했을때 예외 객체를 생성하여 예외 상황에서 해야할 행동 정의 
		}
		else {
			System.out.println(no1 / no2);
		}
	}
}

public class Re_try_catch1 {

	public static void main(String[] args) {
		Calculation1 c1 = new Calculation1();


		try {
			c1.divide(24, 8);
			c1.divide(32, 0);
			// 예외발생상황 
		}
		catch (Myexception ex) {
			// 예외상황이 발생하여 ex라는 객체가 생성된다면 catch안의 내용 수행 
			System.out.println(ex.getMessage());
			// 예외가 발생하면 throw한 것을 여기서 catch해서 보여줌  
		}
	}
} 
