/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.investigacionespe;

/**
 *
 * @author arman
 */
public class Fibonacci {
    
    public int fibonacci(int n)
{
    if (n>1){
       return fibonacci(n-1) + fibonacci(n-2);  
    }
    else if (n==1) {  
        return 1;
    }
    else if (n==0){
        return 0;
    }
    else{ //error
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1; 
    }
}
    public String SucesionFibonacci(int n){
        int i = 0;
        String sucesion = "";
        
        while(i<=n){
            if(sucesion.equals("")){
                    sucesion = String.valueOf(fibonacci(i));
            }else{
                    sucesion = sucesion + ", " + String.valueOf(fibonacci(i));
            }
            i++;
        }
        
        return sucesion;

    }
    
}
