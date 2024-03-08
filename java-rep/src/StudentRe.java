public class StudentRe {
    private String name;
    private int age;
    private String region;
    private String personalNum;

    public StudentRe(){ // 기본생성자

    }

    public StudentRe(String name, int age, String region, String personalNum){
        this.name = name;
        this.age = age;
        this.region = region;
        this.personalNum = personalNum;
    }

    // getter : 읽는 녀석 read
    // setter : 쓰는 녀석 write
    // public void 메소드 이름(파라미터) → parameter
    // 파라미터 == 매개변수
    // System.out.println("Java"); , System.out.println(a);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPersonalNum() {
        return personalNum;
    }

    public void displayAll(){
        System.out.println(this.name + " " + this.age + " " + this.region);
    }

}


