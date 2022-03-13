package 생활코딩.OOP;

import java.io.FileWriter;
import java.io.IOException;

public class EX_OOP {
    public static void main(String[] args) throws IOException {
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        // 내림
        System.out.println(Math.ceil(1.8));
        // 올림

        // 클래스 : 서로 연관된 변수와 메소드를 그룹핑한 껍데기

        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write("Java");
        f1.close();

        FileWriter f2 = new FileWriter("data1.txt");
        f2.write("Hello1");
        f2.write("Java1");
        f2.close();

        // FileWriter라는 클래스를 불러와서(인스턴스) data.txt에 Hello와 Java를 작성하고 close를 통해 write기능을 종료
        // Math처럼 짧은 구문으로 끝나는 작업은 해당 클래스에 직접 들어가서 하면 되지만 FileWriter와 같이 긴 구문으로 진행해야하는 작업은 인스터스를 만들어서 진행하는 것이 좋음

        // Class : System, Math, FileWriter
        // instance : f1, f2





    }
}
