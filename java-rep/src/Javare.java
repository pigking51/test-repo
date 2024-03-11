public class Javare {
    public static void main(String[] args) {
        StudentREre tom = new StudentREre("Tom", 22, "jeju", "12345678");
        StudentREre pepe = new StudentREre("Pepe", 43, "Daegu", "23426465");
        StudentREre paul = new StudentREre();

        paul.setName("palk");
        paul.setAge(55);
        paul.setRegion("CheonAn");
        paul.setPersonalNum("1234567831");

        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.region);
        System.out.println(tom.personalNum);
        tom.displayAll();
        pepe.displayAll();
        paul.displayAll();


    }




}
