package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
    	//Create an ArrayList
        List<String> myList = new ArrayList<>();
        
        //Add 5names to the list
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Pineapple");
        myList.add(1, "Pappya");
        myList.add(3, "Melon");
        
        //Print all elements using a loop
        for (String name : myList) {
        	System.out.println(name);
        }
       
        //Print the 3rd element
        System.out.println("The third elements is:" + myList.get(2));
        //Search for a specific name
        System.out.println("Is Priyanka in the list?:" + myList.contains("Priyanka"));
        
        //Print the size of the list
        System.out.println("No. of elements in the list before remove: "+ myList.size());
        //Remove a elements
        myList.remove(1);
        myList.remove("Melon");
        //Print the size of the list after remove()
        System.out.println("No. of elements in the list after remove:" + myList.size());
        
     }
        
 }

        
        
        