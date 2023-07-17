import clases.ConversorTemperatura;
import clases.ConvertirMonedas;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Boolean ejecutar = true;
        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
        ConvertirMonedas convertirMonedas = new ConvertirMonedas();

        while (ejecutar){
            String[] opciones = {"Conversor de Monedas", "Conversor de Temperatura"};
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                    "Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, "Selección");

            if(opcion == null){
                JOptionPane.showMessageDialog(null, "Hasta pronto");
                break;
            }

            switch (opcion) {
                case "Conversor de Monedas":
                    convertirMonedas.convertirMonedas();
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
