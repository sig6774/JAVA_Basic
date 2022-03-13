package 생활코딩.OOP;

public class EX_MyOOP {
    public static String delimiter = "";

    public static void main(String[] args) {
        // 엄청 긴 줄이 있다고 생각
        System.out.println("-----");
        System.out.println("A");
        System.out.println("A");
        // 엄청 긴 줄이 있다고 생각
        System.out.println("-----");
        System.out.println("A");
        System.out.println("A");
        //

        printA("------");
        printA("------");

        printB("*****");
        printB("*****");

        String delimiter = "-----";

        String delititer1 = "*****";
        printA(delimiter);
        printB(delititer1);
        // 이렇게 인자를 지정해서 변수를 넣어줄 수 있음

        printA1();
        printB1();
        // 메소드안에 변수는 메소드안에서만 사용 가능하기 때문에 전역변수를 사용하게 되면 해당 문제를 해결할 수 있음
        // 클래스 전역 변수를 지정해주면 클래스안의 메소드에서 모두 사용가능

    }

    public static void printA(String delimiter) {
        System.out.println(delimiter); // 구분자를 -----가 아닌 다른걸로 사용하고 싶을때
        System.out.println("A");
        System.out.println("A");
    }

    public static void printB(String delimiter) {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

    // 전역 변수 사용
    public static void printA1() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public static void printB1() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

}
