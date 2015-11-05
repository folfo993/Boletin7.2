/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author FOLFO
 */
public class Metodos {
    public int pedirNumEntero(){
        short num;
        String res = JOptionPane.showInputDialog("numero");
        num = Short.parseShort(res);
        return num;
    }
    
    public void sumaResta (int num1, int num2){
        int suma;
        int resta;
        if(num1>=num2){
           suma =num1+num2;
           resta = num1-num2;
           System.out.println("La suma es: "+suma+"y la resta: "+resta);
        }else if(num1<num2){
           suma =num1+num2;
           System.out.println("La suma es: "+suma);
        }
    }
}
