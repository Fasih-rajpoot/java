public class factorial {
    public static int fact(int c){
        int i,j=1;
        for(i=1; i<=c; i++)
        {
            j=j*i;
        }
        return j;
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number to find the factorial: ");
        String x= System.console().readLine();
        Integer d= Integer.parseInt(x);
        int result = fact(d);
        System.out.print("The factorial of number is "+ result);
         

    }
}
