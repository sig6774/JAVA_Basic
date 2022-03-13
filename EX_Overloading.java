package 생활코딩;

public class EX_Overloading {

    /*
    메소드 오버로딩
    - 똑같은 이름의 메소드들이지만 인수의 개수나 타입이 다른 것이 있으면 다른 메소드로 인지하는 것
    - 같은 이름의 다른 메소드를 정의하는 것

    메소드 오버로딩 규칙
    - 똑같은 이름의 매개변수이지만 리턴 타입이 다르면 오류가 발생
     */

    void A(){
        System.out.println("void A()");
    }

    void A(int arg1) {
        System.out.println("void A(int arg1)");
    }

    void A(String arg1) {
        System.out.println("void A (string arg1)");
    }

//    int A () {
//        System.out.println("void A()");
//    }
    // 메소드 오버로딩의 규칙으로 리턴 타입이 다른 int A() 메소드는 오류가 나는 것을 확인할 수 있음

    int left, right;
    int third = 0;

    public void setOperands(int left, int right) {
        System.out.println("setOperands(int left, int right");
        this.left = left;
        this.right = right;
    }

    public void setOperands(int left, int right, int third){
        this.setOperands(left,right);
        // 이렇게 하게 되면 중복을 제거할 수 있음
        System.out.println("setOperands(int left, int right, int third)");
//        this.left = left;
//        this.right = right;
//        // 위의 setOperands와 중복

        this.third = third;
    }
    // 똑같은 이름의 메소드들이지만 인수의 개수나 타입이 다른 것이 있으면 다른 메소드로 인지하고 이것을 메소드 오버로딩이라고 함

    public void sum(){
        System.out.println(this.left + this.right + this.third);
    }

    public void avg() {
        System.out.println((this.left + this.right + this.third) / 2);
    }

    public void avg1() {
        System.out.println((this.left + this.right + this.third) / 3);
    }

    public static void main(String[] args) {
        EX_Overloading e = new EX_Overloading();
        e.setOperands(10,20);
        e.sum();
        e.avg();
        e.setOperands(10,20,30);
        e.sum();
        e.avg1();



        EX_Overloading e1 = new EX_Overloading();
        e1.A();
        e1.A(1);
        e1.A("You can do it");
    }


}
