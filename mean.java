public class mean {
    static void checkage(int c){
        if(c < 18){
            System.out.println("You are under age"); 
        }
        else
        {
            System.out.println("Access Granted");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        String eaj = System.console().readLine();
        Integer a = Integer.parseInt(eaj);

        checkage(a);
    }
}
