import java.util.Map;
import java.util.HashMap;

class MapEx {

    public static void main(String[] args) {
        
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("Taj Mahal", 2);
                System.out.println("Map: " + numbers);
            
                System.out.println("Keys: " + numbers.keySet());
               
                System.out.println("Values: " + numbers.values());
               
                int value = numbers.remove("Taj Mahal");
        
                System.out.println("Removed Value: " + value);
            }
        }
        