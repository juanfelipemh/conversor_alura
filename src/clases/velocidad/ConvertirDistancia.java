package clases.velocidad;

import exceptions.ValorExcepcion;

import javax.swing.*;

public class ConvertirDistancia {

    private Kilometro kilometro = new Kilometro();
    private Milla milla = new Milla();

    public void convertirDistancia () {
        String opcion = obtenerOpcionSeleccionada();

        if(opcion == null){
            mostrarMensaje("Hasta pronto");
            return;
        }

        Double distancia = obtenerDistanciaIngresada();

        if(distancia.isNaN()){
            return;
        }

        try {
            Double resultado = realizarConversion(opcion, distancia);
            mostrarResultado(opcion, resultado);
        } catch (ValorExcepcion e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private String obtenerOpcionSeleccionada () {
        String[] opciones = {"Kilometros a Millas", "Millas a Kilometros"};

        return (String) JOptionPane.showInputDialog(null, "Selecciona la opción que desee", "Convertir distancias",
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Seleccione");
    }

    private Double obtenerDistanciaIngresada () {
        try {
            return Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia"));
        } catch (NumberFormatException e){
            mostrarMensaje("Número inválido");
            return Double.NaN;
        }
    }

    private Double realizarConversion(String opcion, Double distancia) throws ValorExcepcion {
        switch (opcion){
            case "Kilometros a Millas":
                return milla.convertirDistancia(distancia);
            case "Millas a Kilometros":
                return kilometro.convertirDistancia(distancia);
            default:
                throw new ValorExcepcion("Opción inválida");
        }
    }

    private void mostrarResultado (String opcion, double resultado) {
        JOptionPane.showMessageDialog(null, opcion + ": " + String.format("%.2f", resultado));
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
