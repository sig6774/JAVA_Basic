package 생활코딩;

/*
접근 제어자를 사용하는 이유
-
 */

class Calculator1{
    private int left, right;
    // 사용자가 직접 변수를 변경하지 못하도록
     public void setOprands(int left, int right){
         this.left = left;
         this.right = right;
     }

     private int _sum(){
         return this.left+this.right;
     }
     // _sum이라는 메소드가 사용자가 접근할 수 없도록 하고 싶을때

     public void sumDecoPlus() {
         System.out.println("++++" + _sum() + "++++" );
     }

     public void sumDecoMinus() {
         System.out.println("----" + _sum() + "----");
     }


}
class A{
    public String y(){
        return "public void y()";
    }

    private String z(){
        return"public void z()";
    }
    public String x(){
        return z();
    }
        }
public class EX_Access {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.y());
//        System.out.println(a.z());
        // z가 private라서 A클래스 외부에서는 접근할 수 없음
        System.out.println(a.x());
        // x는 z와 같은 클래스 소속이므로 접근 가능

        Calculator1 c1 = new Calculator1();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();

    }
}
