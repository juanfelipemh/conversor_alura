import clases.ConversorMonedas;
import clases.ConversorTemperatura;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Boolean ejecutar = true;
        ConversorMonedas conversorMonedas = new ConversorMonedas();
        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();

        while (ejecutar){
            String[] opciones = {"Conversor de Monedas", "Conversor de Temperatura"};
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                    "Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, "Selección");

            switch (opcion) {
                case "Conversor de Monedas":
                    conversorMonedas.ConversorMonedas();
                    break;

                case "Conversor de Temperatura":
                    conversorTemperatura.conversorTemperatura();
                    break;
            }

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?");
                if(JOptionPane.YES_OPTION == respuesta){
                    ejecutar = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Hasta pronto");
                    ejecutar = false;}
        }
    }
}
