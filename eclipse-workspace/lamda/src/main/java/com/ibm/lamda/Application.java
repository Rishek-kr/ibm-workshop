package com.ibm.lamda;

//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.ListIterator;
//
//interface Printer{
//	public void print(String name);
//}
//
//class Process{
//	public void execute(String printerName, Printer printer) {
//		printer.print(printerName);
//	}
//}
//
//public class Application
//{
//	public static void main( String[] args )
//	{
//		Process process = new Process();
//		process.execute("HP Printer Printing", System.out::println);
//		process.execute("Canon",(name)-> System.out.println(name+"Printer printing.."));
//	}
//}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Application {
    public static void main(String[] args) {

        // CustomCollection Operations
        CustomCollection<String> result = new CustomCollection<String>();

        // Add elements to the collection.
        result.addElement("B");
        result.addElement("C");
        result.addElement("D");
        result.addElement("X");
        result.addElement("Y");
        result.addElement("Z");
        result.addElement("A");

        result.addElementAtIndex(1, "A2");

        System.out.println("Original contents of result: " + result);

        // Remove elements from the collection.
        result.removeElement("F");  // No such element, does nothing.
        result.removeElementByIndex(2);  // Removes element at index 2.

        System.out.println("Contents of result after deletion: " + result);

        // Remove first and last elements.
        result.removeFirstElement();
        result.removeLastElement();

        System.out.println("result after deleting first and last: " + result);

        // Get and set a value.
        String val = result.getElementAtIndex(2);
        result.setElementAtIndex(2, val + " Changed");

        System.out.println("result after change: " + result);


        // ArrayList Operations
        ArrayList<String> al = new ArrayList<String>();

        // Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Iterate through the list
        System.out.print("Original contents of al: ");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modify objects being iterated.
        ListIterator<String> litr = (ListIterator<String>) al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");  // Modify the element during iteration
        }

        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Now, display the list backwards.
        System.out.print("Modified list backwards: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();


        // MailList Class
        LinkedList<Address> ml = new LinkedList<Address>();

        // Add elements to the linked list.
        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahome", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        // Display the mailing list.
        for (Address element : ml)
            System.out.println(element + "\n");

    }
}

class CustomCollection<T> {
    private ArrayList<T> list;

    public CustomCollection() {
        list = new ArrayList<>();
    }

    // Add an element to the collection
    public void addElement(T element) {
        list.add(element);
    }

    // Add element at a specific index
    public void addElementAtIndex(int index, T element) {
        list.add(index, element);
    }

    // Remove an element by value
    public void removeElement(T element) {
        list.remove(element);
    }

    // Remove an element by index
    public void removeElementByIndex(int index) {
        list.remove(index);
    }

    // Remove the first element
    public void removeFirstElement() {
        if (!list.isEmpty()) {
            list.remove(0);
        }
    }

    // Remove the last element
    public void removeLastElement() {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }

    // Get the value at a specific index
    public T getElementAtIndex(int index) {
        return list.get(index);
    }

    // Set a value at a specific index
    public void setElementAtIndex(int index, T value) {
        list.set(index, value);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

// Address class
class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" +
               city + " " + state + " " + code;
    }
}
