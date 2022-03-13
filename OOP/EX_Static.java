package 생활코딩.OOP;

class Foo{
    /*
    - static이 붙어 있으면 클래스 소속의 변수
     */
    public static String classvar = "I calss var";
    // static은 인스턴스가 생성되면 링크되어서 인스턴스의 값을 바꾸게 되면 해당 값도 바뀜
    public String instanceVar = "I instance var";
    // 클래스의 인스턴스가 생성될 때 만들어지는 변수

    public static void claasMethod() {
        System.out.println(classvar);
//        System.out.println(instanceVar); // 클래스 메소드 안에서는 인스턴스 변수에는 접근할 수 없음
    }

    public void instanceMethod() {
        System.out.println(classvar);
        System.out.println(instanceVar);
        // 인스턴스 메소드에서는 인스턴스 및 클래스 변수 모두 접근 가능
    }


}
public class EX_Static {
    public static void main(String[] args) {

        System.out.println(Foo.classvar);
        // 클래스를 통해서는 클래스 변수(static)에는 접근 가능
//        System.out.println(Foo.instacevar);
        // 클래스 안에 static이 없는 변수는 접근이 불가 이것은 인스턴스를 위한 변수라는 뜻

        Foo.claasMethod();
//        Foo.instanceMethod();
        // main메소드에서 클래스 메소드는 접근 가능하지만 인스턴스 메소드에서는 접근할 수 없음

        Foo f = new Foo();
        Foo f1 = new Foo();
        System.out.println(f.classvar);
        // 클래스 변수(static)의 링크도 작용하며 클래스 변수의 값이 바뀌면 해당 값도 바뀜
        System.out.println(f.instanceVar);
        // 인스턴스가 생성될때 생성하는 변수

        f.classvar = "changed by f1";
        System.out.println(Foo.classvar);
        System.out.println(f.classvar);
        // classvar가 변화한것을 볼 수 있음

        f.instanceVar = "changed by f";
        System.out.println(f.instanceVar);
        System.out.println(f1.instanceVar);
        // 인스턴스 f의 변수를 변경했을때 값은 변화하지만 f1의 변수는 바뀌지않음 즉, 인스턴스를 만들어질때 생성되는 변수

    }
}
