import clases.monedas.ConvertirMonedas;
import clases.temperatura.ConvertirTemperatura;
import clases.velocidad.ConvertirDistancia;
import exceptions.ValorExcepcion;

import javax.swing.*;

public class Main  {
    public static void main(String[] args) {

        Boolean ejecutar = true;

        ConvertirMonedas convertirMonedas = new ConvertirMonedas();
        ConvertirTemperatura convertirTemperatura = new ConvertirTemperatura();
        ConvertirDistancia convertirDistancia = new ConvertirDistancia();

        while (ejecutar){
            String[] opciones = {"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Distancia"};
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
                case "Conversor de Distancia":
                    convertirDistancia.convertirDistancia();
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
