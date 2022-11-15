/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.*;
import java.util.Collections;

/**
 *
 * @author ferzanoveri
 */
public class CollectionsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        List
        List<String> list=new ArrayList<String>();  
        
        list.add("Mango");  
        list.add("Apple");  
        list.add("Banana");  
        list.add("Grapes");  
        System.out.println(list);
        
        for (int i = 0; i < 4; i++) {
            list.remove(0);
        }
        System.out.println(list);
        
        list.add(0, "Mango");
        list.add(1, "Apple");
        list.add(2, "Banana");
        list.add(3, "Grapes");
        System.out.println(list);
        
//        Set
        Set<String> hash_Set = new HashSet<String>();
        
        hash_Set.add("Mango");
        hash_Set.add("Apple");
        hash_Set.add("Banana");
        hash_Set.add("Grapes");
        System.out.println("\n" + hash_Set);
 
        System.out.println(hash_Set.contains("Mango"));
        
        System.out.println(hash_Set.isEmpty());
        
//        Map
        Map<String, String> hash_Map = new HashMap<String, String>();
        
        hash_Map.put("a", new String("Mango"));
        hash_Map.put("b", new String("Apple"));
        hash_Map.put("c", new String("Banana"));
        hash_Map.put("d", new String("Grapes"));
        
        System.out.println("");
        
        for (Map.Entry<String, String> me :
             hash_Map.entrySet()) {
  
            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        
        System.out.println("The value of key a is: " + hash_Map.get("a"));
        
//        Linkedlist
//          Queue
        LinkedList<String> fruit = new LinkedList<String>();
        
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Grapes");
        System.out.println("\n" + fruit);
        
        for (int i = 0; i < 4; i++) {
            fruit.removeFirst();
            System.out.println(fruit);
        }
        
//        Stack
        fruit.push("Mango");
        fruit.push("Apple");
        fruit.push("Banana");
        fruit.push("Grapes");
        System.out.println("\n" + fruit);
        
        for (int i = 0; i < 4; i++) {
            fruit.pop();
            System.out.println(fruit);
        }
        
                    
//            CompareTo
            String myStr1 = "Hello";
            String myStr2 = "Hello";
            System.out.println("\n" + myStr1.compareTo(myStr2)); // Returns 0 because they are equal
    }
    
}
