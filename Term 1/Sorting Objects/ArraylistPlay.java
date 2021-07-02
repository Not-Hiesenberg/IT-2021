/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistplay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author keera
 */
public class ArraylistPlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // array list ocnstruction and fill
        ArrayList<Student> list = new ArrayList<Student>();       
        list.add(new Student(101, "Vijay", 23));
        list.add(new Student(106, "Ajay", 27));
        list.add(new Student(105, "Jai", 21));
        
        //iterato through array list unsorted and print obj attributes
        Iterator itr1 = list.iterator();
        while (itr1.hasNext()){
            System.out.println((itr1.next()).toString());
        }
        
        System.out.println("\nSort by Age");
        Collections.sort(list, new AgeComparator());
        itr1 = list.iterator();
        while (itr1.hasNext()){
            System.out.println((itr1.next()).toString());
        }
    }

}
