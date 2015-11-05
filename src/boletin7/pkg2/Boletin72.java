/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg2;

/**
 *
 * @author FOLFO
 */
public class Boletin72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        Metodos obx = new Metodos();
        num1= obx.pedirNumEntero();
        num2= obx.pedirNumEntero();
        obx.sumaResta(num1, num2);
    }
    
}
