import java.util.HashMap;
public class Boolean{
public static boolean sum(Integer[] arr, Integer target)
{
HashMap<Integer, Integer> numMap = new HashMap<>();
{
for (int i = 0; i < arr.length; i++) {
int complement = target - arr[i];
if (numMap.containsKey(complement)) {
return true;
} 
else {
numMap.put(arr[i], i);
}
}
return false;
}
}
public static void main(String[] args) {
Integer[] a={1,3,4};
System.out.print("Traget "+sum(a, 4));
}
}