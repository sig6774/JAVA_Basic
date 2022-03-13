package 생활코딩;

public class EX_Inheritance extends Calculator{
    // extends를 사용하여 Calculator클래스를 상속

    /*
    Inheritance
    - 재활용성이 객체지향에서 가장 중요한 목표
    - 상속은 재활용성을 극대화시킨 프로그래밍 기법
    - 어떤 객체안의 변수와 메소드를 다른 객체가 물려받을 수 있는 기능
    - 부모클래스와 자식 클래스의 관계를 상위와 하위 클래스라고 함
     */

    public void substract() {
        System.out.println(this.left - this.right);
    }
    // 기존의 Calculator의 메소드와 변수를 받아와서 새로운 기능을 추가

    public void multiplication() {
        System.out.println(this.left * this.right);
    }
    public static void main(String[] args) {
    EX_Inheritance I = new EX_Inheritance();
    I.setOprands(20, 30);
    I.sum();
    I.avg();
    I.substract();
    // 부모클래스의 변수와 메소드를 받아오고 추가적으로 해당 클래스에서 새로운 기능을 확장
    // 이것이 상속
    I.multiplication();

    }
}
/*
- 상속은 여러명의 자식을 가질 수 있으며 부모의 기능을 모두 사용할 수 있음
- 그렇기 때문에 코드의 중복을 제거, 재활용성 증가 등의 다양한 이점이 존재
 */
