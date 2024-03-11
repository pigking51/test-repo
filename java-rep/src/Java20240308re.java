public class Java20240308re {
    public static void main(String[] args){
        StudentRe jason = new StudentRe("Jason", 33, "PotatoCity", "123456786");
        StudentRe pepe = new StudentRe("pepe", 45, "PalletTown", "4937693774");
        StudentRe andre = new StudentRe();

        andre.setName("Android");
        andre.setAge(13);
        andre.setRegion("Factory");

        jason.displayAll();
        pepe.displayAll();
        andre.displayAll();

    }
}
