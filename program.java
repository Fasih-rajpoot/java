class program {
    
    public static void main(String [] args){
        System.out.print("hello!");
        int i=0;
        while(i<10) {
            System.out.println("How are you");
            i++;
        }
        i=10;
        do{
            System.out.println("Do while");
            i++;
        }
        while(i<10);
        

        for(int j=0;j<10;j++){
            System.out.println("for loop!");
        }

        //Arrays

        int marks[] = new int[5];

        System.out.print("Enter marks of subject 1: ");
        marks[0] = Integer.parseInt(System.console().readLine());

        System.out.print("Enter marks of subject 2: ");
        marks[1] = Integer.parseInt(System.console().readLine());

        System.out.print("Enter marks of subject 3: ");
        marks[2] = Integer.parseInt(System.console().readLine());

        System.out.print("Enter marks of subject 4: ");
        marks[3] = Integer.parseInt(System.console().readLine());

        System.out.print("Enter marks of subject 5: ");
        marks[4] = Integer.parseInt(System.console().readLine());

        System.out.print("Total marks are: " + (marks[0] + marks[1] + marks[2] + marks[3] + marks[4] ));

    }
}
