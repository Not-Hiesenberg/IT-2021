/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistplay;

/**
 *
 * @author keera
 */
public class Student {
    int age;
    String name;
    long id_num;
    
    Student(long id_num, String name,int age){
        this.age=age;
        this.name= name;
        this.id_num=id_num;
    }
   
    @Override
    public String toString(){
        return ""+ this.name+" "+ this.age +" " + this.id_num;
    }
}
