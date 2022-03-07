package 생활코딩;

public class Calculator {
    // calculator라는 객체
    int left, right;

    static  int base = 0;
    static double PI = 3.14;
    // static : 클래스에 소속이 되는 변수를 뜻하며 모든 인스턴스에서 동일한 값을 가짐

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    // 매개변수로 받은 것을 this.~로 저장되고 this.~는 해당 클래스에서 모두 사용 가능

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right)/ 2 + base);
    }

    // 클래스 메소드
    // 클래스 메소드는 this.~처럼 인스턴스 멤버에 접근할 수 없음
    public static void sum1(int left, int right) {
        System.out.println(left + right + base);
    }

    public static void avg1(int left, int right) {
        System.out.println((left + right)/ 2 + base);
    }


    public static void main(String[] args) {

    }

}
