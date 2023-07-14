package clases;

import javax.swing.*;

public class ConversorTemperatura {

    private Temperatura convertirTemperatura = new Temperatura();

    private String[] opciones = {"Celcius a Fahrenheit", "Fahrenheit a Celcuis"};

    public void conversorTemperatura () {
        Double valor;

        String opcion = (JOptionPane.showInputDialog(null, "Selecciona una opción", "Convertir Temperatura",
                JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion" )).toString();

        switch (opcion){
            case "Celcius a Fahrenheit":
                try {
                    valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese un valor"));
                    Double resultado = convertirTemperatura.celciusaFahrenheit(valor);
                    JOptionPane.showMessageDialog(null, "La temperatura en °F es " + String.format("%.2f", resultado));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;

            case "Fahrenheit a Celcuis":
                try {
                    valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese un valor"));
                    Double resultado = convertirTemperatura.FahrenheitaCelcius(valor);
                    JOptionPane.showMessageDialog(null, "La temperatura en °C es " + String.format("%.2f", resultado));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
        }
    }
}
