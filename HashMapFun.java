import java.util.*;

public class HashMapFun {

    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");

        String name = userMap.get("nninja@codingdojo.com");
        System.out.println("The full name is: " + name);

        // String email = userMap.get();
        // System.out.println("Your email is: " + email);

        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));

        }
        // HOW TO GET THE KEY FROM THE VALUE. WHICH I LOOKED UP BUT DIDNT KNOW HOW TO USE: <variable>.getKey()
        // for (HashMap.Entry<String, String> track : trackList.entrySet()) {
        //     System.out.println(track.getKey() + ": " + track.getValue());
        // }

    }
}