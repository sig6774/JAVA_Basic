package 생활코딩;

public class EX_Inheri_Contst extends Calculator{
    // 상속
//    public EX_Inheri_Contst(){}
//    public EX_Inheri_Contst(int param1){}

    public EX_Inheri_Contst(int left, int right){
        super(left, right);
        // super는 부모클래스의 생성자에게 left값과 right값을 준다는 뜻이며 left,right는 부모클래스의 매개변수로 전달
        // super 키워드를 사용하게되면 부모클래스의 기본 생성자가 없어도 오류가 발생하지 않음
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }

    public static void main(String[] args) {
//        EX_Inheri_Contst c = new EX_Inheri_Contst();
        // 자기 자신 클래스를 인스턴스로 할 수 있음
        // 하지만 기본 생성자가 아닌 사용자가 지정한 생성자가 있으면 위의 것을 할 수 없음
        // 하지만 기본 생성자를 만들어주면 자신 클래스를 인스턴스할 수 있음

        EX_Inheri_Contst c1 = new EX_Inheri_Contst(20, 30);
        // 사전에 정의한 메소드를 통해 인수를 Calculator클래스에 전해줘서 해당 인수를 전역변수로 사용
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
