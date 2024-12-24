package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Blue");
        hashMap.put(4, "White");
        hashMap.put(5, "Black");

        // Print the Map
        System.out.println("The Original map: " + hashMap);
        
        // Remove one colour
        hashMap.remove(4);
        // Map after removing a colour
        System.out.println("After removing White: " + hashMap);
        
        // Check if green exists
        if(hashMap.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        
        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + hashMap.size());
        
        //Loop through Map
        for(int key: hashMap.keySet()) {
        	System.out.println(hashMap.get(key));
        	
        }
        	
        	
    }
}