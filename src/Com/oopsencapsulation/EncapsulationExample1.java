package Com.oopsencapsulation;

public class EncapsulationExample1 {
    public static void main(String[] args) {

        Student vidya = new Student();
        vidya.setName("Vidya");
        vidya.setAge(35);
        vidya.setRollNumber(11);

        System.out.println(vidya);

        Student Manoj = new Student();
        Manoj.setName("Manoj");
        Manoj.setAge(38);
        Manoj.setRollNumber(24);

        System.out.println(Manoj);

        Student Riaan = new Student();
        Riaan.setName("Riaan");
        Riaan.setAge(8);
        Riaan.setRollNumber(14);

        System.out.println(Riaan);

        Student Ayaan = new Student();
        Ayaan.setName("Ayaan");
        Ayaan.setAge(4);
        Ayaan.setRollNumber(5);

        System.out.println(Ayaan);

        Student Vivaan = new Student();
        Vivaan.setName("Vivaan");
        Vivaan.setAge(-3);
        Vivaan.setRollNumber(11);

        System.out.println(Vivaan);


    }


}
