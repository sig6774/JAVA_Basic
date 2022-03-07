package 생활코딩;

public class EX_ClassMember {
    static int static_variable = 1;
    int instance_variable = 2;

    static void static_static() {
        System.out.println(static_variable);
    }

    static void static_instance() {
        // 클래스 메소드에서는 인스턴스 변수에 접근할 수 없음
//        System.out.println(instance_variable);
    }

    void instance_static(){
        System.out.println(static_variable);
    }
    // 인스턴스 메소드에서는 클래스 변수 접근 가능

    void instance_instance(){
        System.out.println(instance_variable);
    }

    public static void main(String[] args) {

        EX_ClassMember c1 = new EX_ClassMember();
        // 인스턴스 생성

        c1.static_static();
        // 인스턴스를 이용하여 클래스 메소드에 접근 가능

        c1.static_instance();
        // 클래스 메소드를 이용하여 인스턴스 변수 접근 불가

        c1.instance_static();
        // 인스턴스는 클래스 메소드 접근 가능

        c1.instance_instance();
        // 인스턴스 메소드는 인스턴스 변수에 접근 가능
    }
}
