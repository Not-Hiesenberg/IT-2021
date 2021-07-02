/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistplay;

import java.util.Comparator;

/**
 *
 * @author keera
 */
public class AgeComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) { 
        Student s1 = (Student) obj1;
        Student s2 = (Student) obj2;

        if (s1.age == s2.age) {
            return 0;
        }
        if (s1.age > s2.age) {
            return 1;
        }

        return -1;
    }
}
