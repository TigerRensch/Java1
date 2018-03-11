/*
 * Course: CIS263AA Java Programming: Level 2
 * Lesson 1 (Chapter 10)
 * Exercise 2
 */



public class AnimalDemo {


    public static void main(String[] args) {



        //demo Bear inheritance

        String hibernate = "";
        String inWater = "";

        Bear bear = new Bear();

        bear.setName("Yogi");
        bear.setAge(20);
        bear.setSize(8);
        bear.setFood("berries");
        bear.setHibernating(true);


        String bearName = bear.getName();
        int bearAge = bear.getAge();
        int bearSize = bear.getSize();
        String bearFood = bear.getFood();
        boolean isHibernating = bear.getHibernating();

        if (isHibernating){
             hibernate = "The bear is hibernating.";
        }else{

            hibernate = "Bear is wide awake";
        }

        System.out.println("The bear is called " + bearName + ". The bear is " + bearAge + " years old. " +
                " The bear is " + bearSize + " feet tall. The bear eats " + bearFood + ". " + hibernate + " ");


        //demo Shark inheritance
        Shark shark = new Shark();

        shark.setName("Jaws");
        shark.setAge(5);
        shark.setSize(15);
        shark.setFood("fish");
        shark.setInWater(true);


        String sharkName = shark.getName();
        int sharkAge = shark.getAge();
        int sharkSize = shark.getSize();
        String sharkFood = shark.getFood();
        boolean isInWater = shark.getInWater();

        if (isInWater){
            inWater = "The shark is in the water.";
        }else{

            inWater = "All clear, the shark is not in the water.";
        }

        System.out.println("The shark is called " + sharkName + ". The shark is " + sharkAge + " years old. " +
                " The shark is " + sharkSize + " feet tall. The shark eats " + sharkFood + ". " + inWater + " ");





    }

}
