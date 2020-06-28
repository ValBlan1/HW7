package sc;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

       Queue<String> b = new LinkedList<String>();

       b.add("C");
       b.add("D");
       b.add("F");

        System.out.println(b.poll());
    }

}