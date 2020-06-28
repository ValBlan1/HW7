package sc;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        String[]  vegetables = new String[4];

        vegetables[0]= "Potatoes";
        vegetables[1]= "Carrots";
        vegetables[2]= "Onions";
        vegetables[3]= "Corn";

        ArrayList vegetablesList = new ArrayList();
        vegetablesList.add("Potatoes");
        vegetablesList.add("Carrots");
        vegetablesList.add("Onions");
        vegetablesList.add("Corn");


        System.out.println(vegetablesList);
        vegetablesList.remove("Carrots");
        System.out.println(vegetablesList.contains("Onions"));

    }
}
