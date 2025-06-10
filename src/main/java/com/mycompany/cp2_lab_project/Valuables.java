/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cp2_lab_project;
import java.util.Random;

/**
 *
 * @author 1234
 */
public class Valuables { // every ?valuable and its values index are same so its too easy to access valuables to its value
    private static String[] valuabless = {"Bitcoin", "Etherium", "Solana", "Sushi", "Xripple", "Euro", "Turkish Lira", "Sterling", "Gold/ons", "Silver/ons"}; // holds valuables names
    private static double[] values = {90070, 1638, 142, 0.694, 2.12, 0.87, 0.261, 0.75, 3433, 32.72}; // holds its values properly
    private static String selected_value="Bitcoin";


    public static double[] getValues() {    //returns values array
        return values;
    }

    public static String[] getValuables() {     // returns valuables
        return valuabless;
    }
    
    public static String selecteds_value(String slctd){ // returns selected valuables value as String
        for (int i = 0; i < valuabless.length; i++) {
            
            if(slctd.equals(valuabless[i]))
                return String.valueOf(values[i]);
            
        }
        return null;
    }
    public static int index_Of(String sth){ // returns index of entered valuable
        for (int i = 0; i < valuabless.length; i++) {
            if(valuabless[i].equals(sth))
                return i;
            
        }
        return-1;
    }
    public static void User_selected_val(String selected_val){ // helps us to know user selected which valuable on the table
    selected_value= selected_val;   
    }

    public static String getSelected_value() {// returns users selected valuable as string
        return selected_value;
    }
    public static void change_values(){ //it randomly(+-maks%10) changes values
        for (int i = 0; i < valuabless.length; i++) {
            double rndm = ((Math.random()*20-10)/100); // add or subdstract max 10%
            
            if(0>values[i]+values[i]*(rndm))// if value becomes negative its previous value increases 10%
                values[i]*=1.1;
            else
            values[i]= Math.round((values[i] + values[i] * rndm) * 1000.0) / 1000.0;
            
            
        }
    
    }
    
    
    
   
    
    
}
