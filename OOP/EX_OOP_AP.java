package 생활코딩.OOP;
class Accounting {
    // 부가가치세와 연관된 코드만 이동하고 main에서 실행되도록
    public Accounting(double valueOfSupply1) {
        this.valueOfSupply1 = valueOfSupply1;

    }
    // 생성자 생성

    public static double valueOfSupply;
    // 공급가액
    public static double vatRate = 0.1;
    // 부가가치세율(대한민국의 부가가치세는 동일하기 때문에 static(클래스 소속)으로 고정해놓는것이 좋을 수 있음)
    // 바뀌게 되면 한번에 변경이 되니깐 유지보수에 효율적

    public static double getVat() {
        return valueOfSupply * vatRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVat();
    }
    // 회계와 관련된 클래스라는 것을 확인할 수 있음


    public  double valueOfSupply1;
    public  double getVat1() {
        return valueOfSupply1 * vatRate;
    }

    public  double getTotal1() {
        return valueOfSupply1 + getVat();
    }
    // 인스턴스를 생성할 때 생성되는 변수 및 메소드
}
public class EX_OOP_AP {
//    public static double valueOfSupply;
//    // 공급가액
//    public static double vatRate = 0.1;
//    // 부가가치세율
//
//    public static double getVat() {
//        return valueOfSupply * vatRate;
//    }
//
//    public static double getTotal() {
//        return valueOfSupply + getVat();
//    }

    public static void main(String[] args) {
        Accounting.valueOfSupply = 10000.0;
        System.out.println("Value of supply :" + Accounting.valueOfSupply);
        System.out.println("VAT : " + Accounting.getVat());
        System.out.println("Total : " + Accounting.getTotal());


        Accounting.valueOfSupply = 10000.0;
        System.out.println("Value of supply :" + Accounting.valueOfSupply);
        Accounting.valueOfSupply = 20000.0;
        System.out.println("Value of supply :" + Accounting.valueOfSupply);
        // 클래스의 상태가 계속 바뀌게 된다면 인스턴스를 활용해야함

        Accounting a1 = new Accounting(20000);
//        a1.valueOfSupply1 = 10000.0;

        Accounting a2 = new Accounting(100);
//        a2.valueOfSupply1 = 20000.0;
        System.out.println("Value of supply :" + a1.valueOfSupply1);
        System.out.println("Value of supply :" + a2.valueOfSupply1);
        System.out.println("VAT : " + a1.getVat1());
        System.out.println("VAT : " + a2.getVat1());
        // instance 변수 및 메소드를 활용하기 위해 static 삭제


    }

}
