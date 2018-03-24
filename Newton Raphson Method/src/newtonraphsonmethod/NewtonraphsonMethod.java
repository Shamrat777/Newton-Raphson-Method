/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonraphsonmethod;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Shamrat
 */
public class NewtonraphsonMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //for equation:f(x)=x3-20;
        //and where f'(x)=3x2;(df.format(d))
        float Xo;
        float fOFx=0;
        float fPrimeOFx=0;
        int i;
        float xValue;
        float errorCount;
        
        DecimalFormat df = new DecimalFormat("#.###");
        
            System.out.println("Enter Your Xo value");
        Scanner sc=new Scanner(System.in);
        Xo=sc.nextFloat();
        
        for(i=1; i==i ; i++){
            
        System.out.println("iteration: "+i);
        
        fOFx=Float.parseFloat(df.format(((Math.pow(Xo, 3))-20)));
            System.out.println("fOFx: "+fOFx);
        
        fPrimeOFx=Float.parseFloat(df.format((3*(Math.pow(Xo, 2)))));
            System.out.println("fPrimeOFx: "+fPrimeOFx);
        
        
            
        xValue=Float.parseFloat(df.format(Xo-(fOFx/fPrimeOFx)));
            System.out.println("x"+i+" : "+xValue);
            
        errorCount=Float.parseFloat(df.format(Math.abs((((xValue-Xo)/xValue)*100))));
            System.out.println("Error: "+errorCount+"%");
            
        if(xValue==Xo){
            System.out.println("Xpresent And Xpast value is equal");
            break;
        }    
        
        Xo=xValue;
            
        }
    }
    
}
