package 생활코딩;

public class EX_Array {
    public static void main(String[] args) {
        /**
         배열
         - 연관된 데이터를 모아서 관리하기 위해 사용하는 데이터 타입
         - 여러 개의 데이터를 저정하기 위한 것
         */

        String[] classGROUP = {"최직혁", "최유빈", "한이람", "이고잉"};
        System.out.println(classGROUP[0]);
        System.out.println(classGROUP[1]);
        System.out.println(classGROUP[2]);
        System.out.println(classGROUP[3]);
        for(int i = 0; i<classGROUP.length; i++){
            System.out.println(classGROUP[i]);
        }


        String[] classGroup = new String[4];
        // 4개의 원소로 이루어진 배열 정의
        classGroup[0] = "최진혁"; // 배열에 데이터를 넣는 새로운 방법
        System.out.println(classGroup.length);
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);
        // 길이가 바뀌지 않는 것을 보면 사전에 4개의 원소로 이뤄진 배열로 정의했으므로 length가 바뀌지 않음
        // 파이썬과 다른점은 파이썬은 len하면 그안의 원소의 개수를 말해주는데 자바는 배열안에 몇개의 원소를 넣을 수 있는지를 보여주고 있음


        String[] members = {"최진혁", "최유빈", "한이람"};

        for (int i = 0; i < members.length; i++){
            String member = members[i];
            System.out.println(members + "이 상담을 받았습니다.");
//            System.out.println(members[i] + "이 상담을 받았습니다."); <- 이것도 됨

        }


        // for-each
        for(String e : members){
            // e에 members배열에 하나씩 꺼내서 담아주는 것
            System.out.println(e + "이 상담을 받았습니다. ");
        }
    }
}
