import java.util.HashMap;
public class hashmap1 {
    public static void main(String[] args) {
        HashMap <String, String> capitalCities = new HashMap<String,String>();
        capitalCities.put("England", "Manchester");
        capitalCities.put("Pakistan", "Islamabad");
        capitalCities.put("America", "Washington");
        capitalCities.put("Japan", "Tokyo");
        for(String i: capitalCities.values()){
            System.out.println(i); 
        }
        
    }
}
