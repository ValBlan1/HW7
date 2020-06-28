package sc;

import java.util.HashMap;

public class hashMap2 {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<String, String> ();
        users.put("Lucybla46", "Isaac2020");
        users.put("Valala115", "Camila03");
        users.put("Yeyo206", "Sasha02");
        users.put("tatibla", "Tatis123");

        users.remove("Valala115");

        System.out.println(users.containsValue("Tatis123"));

        System.out.println(users.containsKey("ABC"));
        System.out.println(users.size());

    }





}
