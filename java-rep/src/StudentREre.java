public class StudentREre {
    String name;
    int age;
    String region;
    String personalNum;

    public StudentREre(){ // 기본생성자

    }

    public StudentREre(String name, int age, String region, String personalNum){
        this.name = name;
        this.age = age;
        this.region = region;
        this.personalNum = personalNum;
    }

    public StudentREre(String name, int age, String region){
        this.name = name;
        this.age = age;
        this.region = region;
    }

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

    public void setPersonalNum(String personalNum) {
        this.personalNum = personalNum;
    }

    public void displayAll() {
        System.out.println(this.name + " " + this.age + " " + this.region + " " + this.personalNum);
    }
}
