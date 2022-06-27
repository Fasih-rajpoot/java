public class stest {
    public void isPalind(String word) {
        int i1 = 0;
        int i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i1) != word.charAt(i2)) {
                System.out.println("No");
                break;
            }
            ++i1;
            --i2;
        }
        System.out.println("yes");
    }

    public static void main(String[] args) {
              stest g = new stest();
               g.isPalind("abcba");  
                   
      }
}
