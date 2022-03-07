package 생활코딩;

public class EX_OOP {
    /*
    객체지향프로그래밍
    - 객체는 변수와 메소드를 그룹화한 것이라 생각
    - 객체와 객체를 조합하여 하나의 SW를 만들어 가는 것

    - SW 설계 : 복잡한 현실을 추상화하는 과정
    - 추상화 : 현실의 복잡한 문제를 단순화
    - 부품화 : 로직을 재활용가능하도록 부품화하는 것
        - 메소드 : 프로그램안의 중복처리가 되는 것을 하나의 로직으로 만든 것
    - 캡슐화 : 내부 동작 방법을 안에 숨기고 사용자에게는 사용방법만 노출하는 것이라 생각하자
    - 인터페이스 : 부품(객체)간의 연결점이라 생각
     */

    // 더하기라는 로직을 수행하는 메소드 생성
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }

    public static void main(String[] args) {
        // class : 객체를 만들기 위한 설계도
        // instance : 설계도를 따라 만들어진 제품
        sum(10,20);
        sum(20, 30 );
        // sum메소드의 내용을 바꾸면 더하기가 아니라 다른 기능을 수행할 수 있도록 만들 수 있음

        int left, right;
        left = 10;
        right = 20;
        sum(left, right);
        avg(left, right);

        left = 20;
        right = 30;
        sum(left, right);
        avg(left, right);
        // 이렇게 하면 변수를 각각 다시 지정해줘야 함으로 귀찮음

        // 다른 클래스를 불러와서 메소드 실행
        // 인스턴스 만드는 법
        Calculator c1 = new Calculator();
        // calculator라는 객체의 데이터를 c1에 저장(인스턴스)
        c1.setOprands(10, 20);
        // 다른 클래스를 인스턴스화해서 인수를 넣어주고 로직 진행
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 30);
        c2.sum();
        c2.avg();




    }
}
