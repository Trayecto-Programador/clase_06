/**
 * Realizar un programa solicitando Nombre, grado de estudios y edad para ser
 * contratada en una empresa.
 * a) Si la persona tiene 18 años cumplidos, contratarla;
 * de lo contrario decirle que regrese cuando los haya cumplido.
 * b) Si la persona tiene secundaria, enviar a producción,
 * pero si es licenciado o ingeniero, enviar al área administrativa.
 */
package actividad01;

import javax.swing.JOptionPane;

public class Actividad01 {

    public static void main(String[] args) {
        String nombre, estudio;
        int edad;

        nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        estudio = JOptionPane.showInputDialog("Ingrese su Estudio alcanzado");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));

        if (edad < 18) {
            System.out.println("Volver cuando tenga 18 años de edad");
        } else if (estudio.compareToIgnoreCase("Secundaria") == 0) {
            System.out.println("Contratacion: Aceptada");
            System.out.println("Area: Producción");
        } else if (estudio.compareToIgnoreCase("licenciado") == 0 || estudio.compareToIgnoreCase("ingeniero") == 0) {
            System.out.println("Contratacion: Aceptada");
            System.out.println("Area: Administrativo");
        } else {
            System.out.println("Contratacion: Aceptada");

        }
    }
}
