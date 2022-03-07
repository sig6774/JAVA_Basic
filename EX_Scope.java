package 생활코딩;

public class EX_Scope {

    static int i;

    static void a() {
//        int i = 0;
        i = 0;
    }

    int v = 10;
    // EX_Scope클래스 전역에서 사용하는 변수
    void m() {
        int v = 20;
        System.out.println(v);
        // m이라는 메소드 안에서만 동작하는 v
        System.out.println(this.v);
        // this를 사용하여 전역 변수인 v를 사용가능
        // 이거 재밌네(하나의 메소드에서 같은 이름을 가진 지역변수와 전역변수를 둘 다 사용할 수 있네)

    }

    // a라는 메소드안의 생선된 변수이므로 for문에 영향을 주지 않음
    // 하지만 static으로 지정하고 사용하게 되면 영향을 줌
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
//            a();
//            // a를 넣어도 main함수 밖에 있는 a메소드에 영향을 줄 수 없으므로 for문 그대로 출력
//
//            System.out.println(i);

            for (i = 0; i < 5; i++) {
                a();
                // 만약 전역변수로 i를 지정하게 되면 a메소드가 영향을 주기 때문에 계속 0이 출력
                System.out.println(i);


            }



        }
        EX_Scope e = new EX_Scope();
        e.m();
    }
    /*
    유효범위는 변수를 전역, 지역 변수를 나눠서 좀 더 관리하기 편리하도록 한 것이라고 생각
    즉, 전역 및 지역 변수의 유효범위를 제한하여 메소드들이 상호 공유? 교환하는 프로그램을 만듬
    하지만 전역변수를 많이 사용하게 되면 메소드 및 객체를 재사용하는데 장애요소가 될 수 있음
     */
}

