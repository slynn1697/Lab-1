
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
public class SalesTax {
    public static void main(String[] args) {
        float StateTax = 0.04F;
        float CountyTax = 0.02F;
 String PriceBeforeTax = JOptionPane.showInputDialog("Please enter purchase price");
 try{
     float PriceBeforeTaxfloat = Float.parseFloat(PriceBeforeTax);
     float PriceAfterTax = (StateTax + CountyTax) * PriceBeforeTaxfloat + PriceBeforeTaxfloat;
     System.out.printf("The price you paid after tax is: $ " + "%.2f", PriceAfterTax);
     } catch(Exception x ){
     System.out.println("Please input the price as a numeric value");
     
     }
    }
}
