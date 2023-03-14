/**
 * Pedir al usuario el precio de un producto (valor positivo) y la forma de pagar
 * ( efectivo o tarjeta) si la forma de pago es mediante tarjeta,
 * pedir el nro de cuenta( inventado).
 */
package practica01;

import javax.swing.JOptionPane;

public class Practica01 {

    public static void main(String[] args) {
        double precioProducto;
        String medioPpago, nroCuenta;

        precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto"));
        medioPpago = JOptionPane.showInputDialog("Ingrese Medio de Pago Tarjeta | Efectivo");
        if (precioProducto < 0) {
            System.out.println("Valor introducido incorrecto");
        } else if (medioPpago.compareToIgnoreCase("Tarjeta") == 0) {
            nroCuenta = JOptionPane.showInputDialog("Ingrese su numero de cuenta");
            System.out.println("Debitaremos de su cuenta: " + nroCuenta + " el importe de " + precioProducto);
        } else if (medioPpago.compareToIgnoreCase("Efectivo") == 0) {
            System.out.println("Gracias por su compra");
        } else {
            System.out.println("Medio de pago incorrecto");
        }

    }
}
