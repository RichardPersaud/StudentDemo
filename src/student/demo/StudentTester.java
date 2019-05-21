/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.demo;

/**
 *
 * @author richa
 */

//Date: May 21 2019

public class StudentTester {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        StudentDemo[] list=new StudentDemo[3];//Array of object 
        
        
        StudentDemo s1 = new StudentDemo();// object created
        s1.setName("Richard");
        list[0]=s1;
        
        StudentDemo s2 = new StudentDemo();// object created
        s2.setName("Peter");
        list[1]=s2;
        
        StudentDemo s3 = new StudentDemo("Samual");// object created
        list[2]=s3;
        
        for(int i=0; i<list.length; i++){
          
            System.out.println(list[i].getName());

        }
               
    }    
    
}
