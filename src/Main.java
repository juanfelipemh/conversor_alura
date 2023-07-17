import clases.monedas.ConvertirMonedas;
import clases.temperatura.ConvertirTemperatura;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Boolean ejecutar = true;

        ConvertirMonedas convertirMonedas = new ConvertirMonedas();
        ConvertirTemperatura convertirTemperatura = new ConvertirTemperatura();

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
                    convertirTemperatura.convertirTemperatura();
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
