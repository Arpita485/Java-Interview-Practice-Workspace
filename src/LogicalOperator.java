public class LogicalOperator {

    //Returns true only when both conditions are true.

    public static void main(String[] args) {
        int age = 23;
        boolean name = true;
        System.out.println(age > 21 && name); //true


        //Returns true when at least one condition is true

        int marks = 35;
        boolean voting = true;
        System.out.println(marks >= 40 || voting); // true


        //Reverses the boolean value.
        boolean vote = false;
        System.out.println(!vote); // true


    }
}
