import de.neuefische.javaw2d3.model.Cat;

public class AppMain {
    public static void main(String[] args) {

        Cat lion = new Cat(5, "Lion", true);
        {
            System.out.println(lion.toString());
        }

//        call method "jump" from Cat
        lion.jump(5);


//    call method "bite" from Cat#
        lion.bite();

//        call method "ageCondition" from Cat
        System.out.println(lion.ageCondition(6));

    }




}



