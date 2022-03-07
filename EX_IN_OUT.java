package 생활코딩;

public class EX_IN_OUT {
    public static void main(String[] args) {
        /*
        부가적 설명 : main메소드의 내용을 구현하면 자바 ap를 실행할 때 main 메소드가 호출되면서 프로그램이 구동
        이때 Strings[] args 는 입력값의 파라미터로 동작
        입력과 출력
        void가 있으면 출력값이 존재하지 않는 것을 의미
        터미널에서 자바 실행방법
        1. java 파일이 있는 디렉토리에서 "javac"를 이용하여 컴파일 진행
        2. src폴더 위치로 이동(cd ..)
        3. "java"를 이용하여 클래스 파일 실행(java 패키지명.파일명)
         */
//        System.out.println(args.length);
        // 자바에서는 length는 배열이 몇개의 값을 담을 수 있는지에 대한 함수

        for (String e : args){
            System.out.println(e);
        }
    }

}
