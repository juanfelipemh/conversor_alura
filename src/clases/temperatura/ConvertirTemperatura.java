package clases.temperatura;

import exceptions.ValorExcepcion;

import javax.swing.*;

public class ConvertirTemperatura {

    private Celcius celcius = new Celcius();
    private Fahrenheit fahrenheit = new Fahrenheit();
    private Kelvin kelvin = new Kelvin();

    public void convertirTemperatura(){
        String opcion = selecioneUnaOpcion();

        if(opcion == null){
            mostrarMensaje("Hasta pronto");
            return;
        }

        Double temperatura = obtenerTemperaturaIngresada();

        if(temperatura.isNaN()){
            return;
        }

        try {
            Double resultado = realizarConversion(opcion, temperatura);
            mostrarResultado(opcion, resultado);
        } catch (ValorExcepcion e) {
            mostrarMensaje(e.getMessage());
        }

    }

    private String selecioneUnaOpcion(){
        String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsuis", "Celsius a Kelvin", "Kelvin a Celsius", "Fahrenheit a Kelvin", "Kelvin a Fahrenheit"};

        return (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Convertir Temperatura",
                JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion" );
    }

    private Double obtenerTemperaturaIngresada(){
        try {
            return Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura"));
        } catch (NumberFormatException e) {
            mostrarMensaje("Ingrese un número válido");
            return Double.NaN;
        }
    }

    private Double realizarConversion(String opcion, Double temperatura) throws ValorExcepcion {
        switch (opcion) {
            case "Celcius a Fahrenheit":
                return fahrenheit.convertir(temperatura);
            case "Fahrenheit a Celcuis":
                return celcius.convertir(temperatura);
            case "Celsius a Kelvin":
                return celcius.convertirCelciusAKelvin(temperatura);
            case "Kelvin a Celsius":
                return kelvin.convertir(temperatura);
            case "Fahrenheit a Kelvin":
                return fahrenheit.convertirFahrenheitAKelvin(temperatura);
            case "Kelvin a Fahrenheit":
                return kelvin.convertirKelvinAFahrenheit(temperatura);
            default:
                throw new ValorExcepcion("Opción inválida");
        }
    }

    private void mostrarResultado (String opcion, double resultado){
        JOptionPane.showMessageDialog(null, opcion + ": " + String.format("%.2f", resultado));
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
