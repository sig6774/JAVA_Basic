package Try_catch;
/*
- 예외상황이 발생할 가능성이 있는 메소드를 정의할 때 throws Exception을 표기하여 예외 발생 조건 정의 
- 예외가 발생할 메소드가 있는 클래스를 객체로 만들면 try catch안에서 수행
- 예외가 발생할 가능성이 있는 메소드를 수행해야 한다면 반드시 try블록 안에서 수행해야 하고 예외가 발생했다면 catch안의 내용을 수행 
 */

class Calculation{
	public void divide(int no1, int no2) throws Exception{
		// 예외상황을 표현하는 것 
		if (no2 == 0) {
			throw new Exception("zero is not divided");
			// 예외가 발생했을때 예외 객체를 생성하여 예외 상황에서 해야할 행동 정의 
		}
		else {
			System.out.println(no1 / no2);
		}
	}
}
public class Re_try_catch {

	public static void main(String[] args) {
		Calculation c1 = new Calculation();
		
//		c1.divide(34, 5);
		// 오류가 뜨는 이유는 예외가 발생할 가능성이 있는 method를 try안에 넣지않고 그대로 실행했기 때문 
		
		try {
			c1.divide(24, 8);
			c1.divide(32, 0);
			// 예외발생상황 
		}
		catch (Exception ex) {
			// 예외상황이 발생하여 ex라는 객체가 생성된다면 catch안의 내용 수행 
			System.out.println(ex.getMessage());
			// 예외가 발생하면 throw한 것을 여기서 catch해서 보여줌  
		}
		// 예외가 발생할 수 있는 method를 실행하기 위해서는 반드시 try catch 안에서 수행해야하며 예외가 발생했을때의 행동도 지정해야함 

	}

}
