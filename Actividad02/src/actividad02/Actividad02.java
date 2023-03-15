/**
 * Hacer un algoritmo que calcule el total a pagar por la compra de camisas. 
 * Si se compran. 
 * A) tres camisas o más se aplica un descuento del 20% sobre el total de la compra 
 * B) si son menos de tres camisas un descuento del 10%
 */
package actividad02;

import javax.swing.JOptionPane;


public class Actividad02 {

    
    public static void main(String[] args) {
      int cantidad, precio;
      double descuento1, descuento2,total;
      
      cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de camisas"));
      precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de la camisas"));
      descuento1 = 0.2;
      descuento2 = 0.1;
      
      if(cantidad >= 3){
          total = (precio - precio * descuento1) * cantidad;
      }else{
          total = (precio - precio * descuento2) * cantidad;
      }
      
        System.out.println("El total abonar es : " + total);
      
    }
    
}
