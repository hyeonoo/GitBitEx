
/*
    FileName : Developer1Test.java
    :: Developer1.class를 Instance 생성 사용하는 class 정의 :: Application class 정의 
*/
public class Developer1Test {
    ///Field
    ///Method
    ///Main Method
    public static void main(String[] arsg){

        /// Developer1.class를 Instance 생성
        Developer1 developer = new Developer1();

        // developer 식별성을 갖는 Instance .연산자를 통해 사용
        System.out.println("이름은 :"+developer.name);
        System.out.println("직업은 :"+developer.job);
        System.out.println("평균수입은 :"+developer.avgIncome);
        System.out.println("PJT경력은 :"+developer.projectCareer);

        System.out.println("========================");

        //project에 참여
        developer.participateProject();
        System.out.println("평균수입은 : "+developer.avgIncome);
        System.out.println("project 참여 경력은 : "+developer.projectCareer);

        System.out.println("========================");

        //1개 과목을 강의
        developer.instruct();
        System.out.println("평균수입은 : "+developer.avgIncome);

        ////////////////////////// 추 가 된 부 분 ///////////////////////////////

        System.out.println("========================");

        //홍길동이 한미은행 project에 참여 
        String projectName = "한미은행";
        developer.participateProject(projectName);
        //==> 위의 두라인을 아래와 같이 표현했다. 주석풀고 출력결과 확인하면..??
        //developer.participateProject("한미은행"); //==> 같은결과 
        System.out.println("평균수입은 : "+developer.avgIncome);
        System.out.println("project참여 경력은 : "+developer.projectCareer);

        System.out.println("=========================");

        //홍길동이 2개 과목을 강의
        int lectureCount = 2;
        developer.instruct(lectureCount);
        //==> 위의 두라인을 아래와 같이 표현했다. 주석풀고 출력결과를 확인하면..??
        //developer.instruct(2);    //==> 같은결과
        System.out.println("평균수입은 : "+developer.avgIncome);
    }
}
