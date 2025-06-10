/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cp2_lab_project;
import java.util.ArrayList;


public class User {
    
    private double[] how_many = {0,0,0,0,0,0,0,0,0,0};  // holds how many valuables does he/she have
    
    private String user_name,user_password,card_infos;
    private boolean isMale; // If it is true user is male
    private int age=18;
    private double balance;
    
    
    
    
    public User(String name, String password,String card, int age,boolean gender){
        user_name=name;
        user_password=password;
        card_infos=card;
        this.age=age;
        isMale = gender;
        balance = 10;
        
    
    }
    

    public double getBalance() {   //returns current users balance
       
       return UserManager.get_current_user().balance;
       
        
    }
    
    public double[] what_have(){    // return array which holds current users valuables
       return UserManager.get_current_user().how_many;
    }
    
    public void buy(String sth, int howmany, double unitprice){   // adds how_many array to how many item bought, item and how many's index' are same  
        
        UserManager.get_current_user().how_many[Valuables.index_Of(sth)]+=howmany;
        UserManager.get_current_user().balance -= unitprice*howmany;
        
        
    
    }
    
    public void sell(String sth, int howmany, double unitprice){    // helps to substract how many valuable is sold and sets new balance
        UserManager.get_current_user().how_many[Valuables.index_Of(sth)]-=howmany;
        UserManager.get_current_user().balance += unitprice*howmany;
        
    }
    
    public void top_up_balance(int balance){// adds balance to this users account
        UserManager.get_current_user().balance+=balance;   
    
    }
    
    public void current_User(String name){       // helps us to hold current user
        for (int i = 0; i < UserManager.getAll_Users().size(); i++) {
            if(UserManager.getAll_Users().get(i).user_name.equals(name)){
                    UserManager.current_user(i);
                
           
                }
            
            
        }
      
        
    
    }
    

    
    public boolean isMale(){                    // only for Login 151 153. lines
        if(UserManager.get_current_user().isMale)
            return true;
        else
            return false;
    }
    
    public void add_to_users_array(User u){ // adds user to users arraylist
        UserManager.add_users(u);
        
    }
    
    public int array_size(){    //returns users arrays size
        return UserManager.getAll_Users().size();
    }
    
    public int this_name_in_which_index(String name){   // returns sended names index
        for (int i = 0; i < UserManager.getAll_Users().size(); i++) {
            if(UserManager.getAll_Users().get(i).user_name.equals(name))
                return i;
            
            
        }
        return -1;
        
    }
    public boolean can_logs_in(String name, String password){   // checks if user's password is true or not 
        for (int i = 0; i < UserManager.getAll_Users().size(); i++) {
            if(UserManager.getAll_Users().get(i).user_name.equals(name) && UserManager.getAll_Users().get(i).user_password.equals(password))
                return true;
        }
        return false;
    }
    public void set_Admins_Balance(){   // admin is important
        UserManager.getAll_Users().get(0).balance=1000000000;
                
    }
    
    public void set_Admins_Valuables(){
        UserManager.getAll_Users().get(0).how_many[0]=5;
        UserManager.getAll_Users().get(0).how_many[2]=152;
        UserManager.getAll_Users().get(0).how_many[6]=52;
        UserManager.getAll_Users().get(0).how_many[4]=425;
        UserManager.getAll_Users().get(0).how_many[7]=785;
        
    
    }
    
    
            
    
}
