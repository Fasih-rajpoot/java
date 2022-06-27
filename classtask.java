public class classtask {

    public static void main(String[] args) {
        System.out.print("enter numbers: ");
        String marks = System.console().readLine();
        Integer a = Integer.parseInt(marks);

        if (a >= 80) {
            System.out.print("Your grade is A");
        } else if (a >= 70) {
            System.out.print("Your grade is B");
        } else if (a >= 60) {
            System.out.print("Your grade is C");
        } else if (a >= 50) {
            System.out.print("Your grade is D");
        } else
            System.out.print("You are fail.");
    }

}
