
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class CookieCalories {
    public static void main(String[] args) {
        
   
    int ServingSize = 4;
    int CaloriesPerServing = 300;
  String CookiesYouAte = JOptionPane.showInputDialog("Please input the number of cookies you ate");
try {
   
    float CookiesYouAtefloat = Float.parseFloat(CookiesYouAte);
    float CaloriesYouveHad = (CaloriesPerServing / ServingSize) * CookiesYouAtefloat;
    
    System.out.println("You ate this many calories " + CaloriesYouveHad);
 } catch (Exception x)
    { 
    System.out.println("Please enter a whole number");
    }
    }
    
}