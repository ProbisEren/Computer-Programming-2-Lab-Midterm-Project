/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cp2_lab_project;

import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class UserManager {
    // en son bunu private yaptım
   private static ArrayList<User> All_Users = new ArrayList<>();
   private static int current_user =0;

    public static ArrayList<User> getAll_Users() { // returns all users array 
        return All_Users;
    }

    public static void add_users(User e){   // adds new user to arraylist
        All_Users.add(e);
    }
    
    public static void current_user(int i){ // helps us to hold current user
        current_user=i;
    }
    
    public static User get_current_user(){ // helps us to use current user and so user methods
        return All_Users.get(current_user);
    }
    

    
    
    
    
    
    
}
