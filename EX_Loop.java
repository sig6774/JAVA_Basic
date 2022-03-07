package 생활코딩;

public class EX_Loop {
    public static void main(String[] args) {
        // break, continue
        for (int i = 0; i<10; i++){
            if (i==5){
                break;
            }
            // 반복문에 break를 사용하게 되면 반복문을 종료시킴
            System.out.println(i);


        }
        for (int i = 0; i<10; i++){
            if (i==5){
                continue;
            }
            // 반복문에 continue를 사용하게 되면 continue 밑은 사용하지 않고 다시 반복을 수행
            System.out.println(i);


        }


        // 반복문 중첩
        for (int i = 0; i < 10; i++){
            for(int j =0; j<10; j++){
                System.out.println(i +"" + j);
            }
        }



    }
}
