package 생활코딩;

public class EX_Member {
    public static void main(String[] args) {
        /*
        인스턴스 변수
        - 인스턴스 마다 변수가 달라지는 변수

        클래스 변수
        - 클래스 안에 존재하여 클래스에 저장되고 바뀌지 않는 변수이며 클래스안에서 공유
        - 인스턴스에 따라 변하지 않는 값이 필요한 경우
         */

        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        c1.setOprands(10, 20);
        c1.sum();

        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
        // 클래스변수로 선언된 PI변수를 출력하고 값이 바뀌지 않음
        c2.setOprands(20, 30);
        c2.sum();

        System.out.println(Calculator.PI);
        // 인스턴스가 바뀌어도 값이 바뀌지 않고 직접 클래스에 접근해서도 출력 나옴

        Calculator.base = 10;
        // base값을 변화
        System.out.println("클래스 변수 사용");
        c1.sum();
        // base라는 클래스변수의 값을 바꿔줌으로 sum()연산이 진행된 후 사용자가 지정한 10의 값을 더해줄 수 있음


        // 클래스 메소드
        System.out.println("클래스 메소드");
        Calculator.sum1(10,20);
        Calculator.avg1(20, 30);

        /*
        - 인스턴스 메소드는 클래스 멤버에 접근할 수 있음
        - 클래스 메소드는 인스턴스 메소드에 접근할 수 없음 <- 이거 중요
         */



    }
}
