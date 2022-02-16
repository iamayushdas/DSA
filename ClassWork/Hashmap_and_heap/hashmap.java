import java.util.HashMap;
public class hashmap {
    public static void main(String[] args){
        // Declare and initialise hashmap
        // HashMap<key, value> hm = new HashMap<>();

        HashMap<String, Integer> hm = new HashMap<>();

        // put
        hm.put("India", 428);
        hm.put("China", 628);
        hm.put("US", 400);
        hm.put("India", 448);
        hm.put("Dubai", 300);

        System.out.println(hm);

        // get
        int indData = hm.get("India");
        System.out.println("POpulation of india : "+ indData);

        // containsKey
        boolean isChinaPresent = hm.containsKey("China");
        boolean isBangladeshPresent = hm.containsKey("Bangladesh");
        System.out.println(isChinaPresent);
        System.out.println(isBangladeshPresent);


        // keyset
        for(String key : hm.keySet()){
            System.out.println(key);
        }

        // size
        System.out.println(hm.size());
    }
}   
