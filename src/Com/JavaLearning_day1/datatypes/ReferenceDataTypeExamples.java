package Com.JavaLearning_day1.datatypes;


public class ReferenceDataTypeExamples {

    public static void main(String[] args) {

         int count = 10;
        // Classess or Objects

        Person vidya = new Person("Vidya", 35);
        System.out.println("name:: " + vidya.getName());
        System.out.println("Age:: " + vidya.getage());


        // Arrays

        int [] numbers = new int[] {1,2,3,4,5,6,7};
        int [] numbers2 = {10,30,50,80};

        System.out.println("Numbers Length:: "+ numbers.length);
        System.out.println("First Elements:: " + numbers[5]);


        // String
        String greetings = "Hello World";
        System.out.println("Message:: "+ greetings);

        String [] names = {"vidya", "Manoj", "Riaan", "Ayaan"};



    }
}

class Person {

   private String name;

     public int getage() {
         return age;
     }

    public void setAge(int age) {
         this.age = age;

    }

   public String getName(){
         return name;

   }
   public void setName(String name){
         this.name =name;
   }

   private int age;

  public Person(String name, int age)  {
       this.age = age;
       this.name = name;

      }
}



