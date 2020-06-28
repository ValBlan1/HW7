package sc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void main(String[] args) {
        List<String> Employees = new LinkedList<String>();
        Employees.add("Jose B.");
        Employees.add("Camila C");
        Employees.add("John S");
        Employees.remove("Lynn F");

        Iterator it = Employees.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }


}
