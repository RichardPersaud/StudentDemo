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
public class StudentDemo {

  private String name;
  
  //constructor recieves data from another class
  public StudentDemo(){
  
     
  
  }
  
   public StudentDemo(String input){
  
      this.name=input;
  
  }
  
  
  

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
