package 생활코딩.OOP;

public class EX_Instance {
    /*
    - 클래스를 복제하여 각 기능을 수행할 수 있도록 하는 것이 인스턴스
     */

    public static void main(String[] args) {
        EX_MyOOP p = new EX_MyOOP();
        // 인스턴스화
        p.printA("---------");
        // MyOOP 클래스를 인스턴스화하여 MyOOP클래스의 메소드를 불러올 수 있음

        p.delimiter = "()()()()()";
        p.printA1();
        p.printB1();
        // printB1메소드는 delimiter라는 전역변수를 받아서 구분자로 사용하기 때문에 이렇게도 가능

        EX_MyOOP p1 = new EX_MyOOP();
        p1.delimiter = "&&&";
        p1.printA1();
        p1.printB1();

        // 클래스를 바꾸지 않고 복제본을 생성하여 클래스의 일부분을 바꾸면서 그 기능을 사용할 수 있는게 인스턴스라고 생각?






    }
}
