package sc;


import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 8;

        HashMap<String, Integer> abc = new HashMap<String, Integer>();
        abc.put("a",10);
        abc.put("b", 5);
        abc.put("c", 8);

        System.out.println(abc.get("c"));
     }



}
