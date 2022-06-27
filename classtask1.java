public class classtask1 {
    public static void main(String[] args) {
        int n, m;
        System.out.print("Enter The Student Range : ");
        n = Integer.parseInt(System.console().readLine());

        System.out.print("Enter The Subject Range : ");
        m = Integer.parseInt(System.console().readLine());
        String[][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks of student " + (i + 1) + " : \n");
            for (int j = 0; j < m; j++) {
                System.out.print("\tEnter the marks of subject " + (j + 1) + " : ");
                arr[i][j] = System.console().readLine();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\nMarks of student " + (i + 1) + " = ");
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + ", ");

            }
        }

    }
}
