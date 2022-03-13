package 생활코딩.OOP;

class Print{
    // - 멤버 : 클래스에 소속된 변수 혹은 메소드
    public static String delimiter = "";

    public static void A1() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public static void B1() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

}
public class EX_PrintClass {
    // 프로그램이 실행되기 위해 컴퓨터는 .java 이름과 똑같은 클래스를 만들고 이후 main 메소드를 통해 실행
    // 컴파일을 했을때 EX_PrintClass.class파일과 print.class파일이 생성됨
    // 기능에 따라 파일을 적당히 분산해서 만들 수 있음(Print를 다른 class파일로 만들 수 있음(분리하기 원하는 클래스를 지정후 Refactor를 통해 move type to new를 클릭하여 새롭게 생성 가능)
    public static void main(String[] args) {
        Print.delimiter = "-----";
        Print.A1();
        Print.B1();
    }
    /*
    - MyOOP클래스에 있는 코드보다 훨씬 간결하게 바뀜
    - 클래스는 코드를 간결하게 할 수 있고 재사용가능하게 함으로 효율적인 코드 작성 가능
    - 클래스는 서로 연관되어 있는 것의 집합이라고 생각할 수 있음
     */

}
