package 생활코딩;

public class EX_Overriding extends Calculator {
    public EX_Overriding(int left, int right) {
        super(left, right);
    }
    // 부모 클래스의 생성자에게 left, right 인자를 넘겨주는 것

    /*
    메소드 오버라이딩
    - 자식 클래스가 부모 클래스의 기본적인 동작방법을 필요에 따라 변경할 수 있으면 더 많은 기능 수행 가능

    메소드 오버라이딩 조건
    - 메소드의 이름이 같아야함
    - 메소드의 형식도 같아야함
     */

    public void sum() {
        System.out.println("실행 결과는 " + (this.left + this.right + "입니다."));
    }
    // 자식 클래스에서 부모 클래스가 가지고 있는 메소드를 재정의하게 되면 부모클래스의 메소드는 무시되고 자식 클래스의 메소드가 출력되며 이것을 메소드 오버라이딩이라고 함

    public void avg() {
        System.out.println("실행결과는 " + (this.left + this.right) / 2+ "입니다.");
//        return (this.left + this.right) / 2;
    }
    // 부모 클래스의 메소드의 형식(void)과 자식 클래스의 메소드의 형식(int)가 다르면 안됨
    // 부모와 자식 클래스의 로직이 같으므로 이것을 super를 통해 변경할 수 있음

    public void substract() {
        System.out.println(this.left - this.right);
    }

    public int avg2() {
        return super.avg2();
    }
    // 부모와 자식클래스의 메소드의 로직이 같으므로 해당 내용을 super를 통해 중복을 줄일 수 있음
    public static void main(String[] args) {

        EX_Overriding e = new EX_Overriding(20, 30);
        e.avg();


    }
}
