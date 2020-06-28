package sc;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        Stack<String> books = new Stack<String>();

        books.add("Harry Potter");
        books.add("The Room Where It Happened");
        books.add("Becoming");
        books.add("Then She Was Gone");

        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());

        System.out.println(books.get(0));

    }

}
