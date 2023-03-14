/**
 * “La langosta ahumada” es una empresa dedicada a ofrecer banquetes;
 * sus tarifas son las siguientes: el costo de platillo por persona es de $95.00,
 * pero si el número de personas es mayor a 200 pero menor o igual a 300,
 * el costo es de $85.00.
 * Para más de 300 personas el costo por platillo es de $75.00.
 * Se requiere un algoritmo que ayude a determinar el presupuesto que se debe
 * presentar a los clientes que deseen realizar un evento.
 * Se requiere determinar cuál de tres cantidades proporcionadas es la mayor.
 */
package practica02;

import javax.swing.JOptionPane;

public class Practica02 {

    public static void main(String[] args) {
        int cantidadComensales;
        double costo, costo1, costo2, presupuesto;

        cantidadComensales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de comensales"));
        costo = 95.00;
        costo1 = 85.00;
        costo2 = 75.00;

        if (cantidadComensales <= 0) {
            System.out.println("El ingreso de datos de comensales es erroneo, no debe contener cero o  valor negativo");
        } else {
            if (cantidadComensales > 0) {
                if (cantidadComensales <= 200) {
                    presupuesto = cantidadComensales * costo;
                    System.out.println("Su presupesto es: " + presupuesto + " en base a " + cantidadComensales + " comensales");
                } else if (cantidadComensales > 200 && cantidadComensales <= 300) {
                    presupuesto = cantidadComensales * costo1;
                    System.out.println("Su presupesto es: " + presupuesto + " en base a " + cantidadComensales + " comensales");
                } else {
                    presupuesto = cantidadComensales * costo2;
                    System.out.println("Su presupesto es: " + presupuesto + " en base a " + cantidadComensales + " comensales");
                }
            }
        }
    }
}
