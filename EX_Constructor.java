package 생활코딩;

public class EX_Constructor {
    /*
    Constructor : 인스턴스화할때 다른 인수를 받을 수 있도록 해주는것?
    */

    int left, right;

    public EX_Constructor(int left, int right) {
        this.left = left;
        this.right = right;
    }
    /*
    Constructor(생성자) : 클래스가 생성될 때 똑같은 이름을 가진 생성자가 생성되도록 되어 있고 해당 생성자에 로직을 넣게 되면
    해당 객체가 가장 먼저 해야할 일(초기화)을 수행하도록 함
    그러면 밑에서 인스턴스화하는 것은 클래스를 호출하는게 아니라 생성자를 호출하는 것
     */


    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
    public static void main(String[] args) {

        EX_Constructor c1 = new EX_Constructor(20, 30);
        c1.sum();
        c1.avg();

        EX_Constructor c2 = new EX_Constructor(30, 50);
        c2.sum();
        c2.avg();


    }
}
