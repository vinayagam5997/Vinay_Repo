package org.example;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Vinayagamoorthy Ezhumalai <n520492> on 25/02/2023
 */
public class MapIteration {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("vinay", 5997);
        map.put("chella", 1234);
        map.put("raja", 456);
        //Set<Map.Entry<String, Integer>> entry = map.entrySet();

        // using the forEach method
        for (Map.Entry<String, Integer> value : map.entrySet()) {
            System.out.println(value.getKey() + "!" + value.getValue());
            System.out.println();
        }
        //using the java8 forEach
         map.forEach((k,v)->System.out.println(k+"  "+v));

         //keys and values separately
        for (String s :
                map.keySet()) {
            System.out.println(s);
        }
        for (Integer i: map.values()
             ) {
            System.out.println(i);
        }

        // using the keyset we getting values
        for (String ss :
             map.keySet()) {
            System.out.println(ss+"  "+map.get(ss));
        }

    }


}

