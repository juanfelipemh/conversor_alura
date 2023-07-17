package clases.monedas;

import exceptions.ValorExcepcion;
import utils.Moneda;

import javax.swing.*;

public class ConvertirMonedas {

    private MonedasLocales monedasLocales = new MonedasLocales();
    private MonedasExtranjeras monedasExtranjeras = new MonedasExtranjeras();

    public void convertirMonedas(){
        String opcion = obtenerOpcionSeleccionada();

        if (opcion == null) {
            mostrarMensaje("Hasta pronto");
            return;
        }

        double valor = obtenerValorIngresado();

        if (Double.isNaN(valor)) {
            return;
        }

        try {
            double resultado = realizarConversion(opcion, valor);
            mostrarResultado(opcion, resultado);
        } catch (ValorExcepcion | NumberFormatException e) {
            mostrarMensaje(e.getMessage());
        }
    }

    private String obtenerOpcionSeleccionada(){
        String[] opciones = {"Peso Colombia a Dólar", "Peso Colombia a Euro", "Peso Colombia a Libra", "Peso Colombia a Yen", "Peso Colombia a Wom",
                "Dólar a Peso Colombia", "Euro a Peso Colombia", "Libra a Peso Colombia", "Yen a Peso Colombia", "Wom a Peso Colombia"};

        return (String) JOptionPane.showInputDialog(null, "Selecciona una divisa", "Conversión de divisas",
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Seleccion");
    }

    private double obtenerValorIngresado() {
        try {
            return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor:"));
        } catch (NumberFormatException e) {
            mostrarMensaje("Ingrese un número válido");
            return Double.NaN;
        }
    }
    private double realizarConversion(String opcion, double valor) throws ValorExcepcion {
            switch (opcion) {
                case "Peso Colombia a Dólar":
                    return monedasLocales.convertir(valor, Moneda.COP_TO_USD.getFactor());
                case "Peso Colombia a Euro":
                    return monedasLocales.convertir(valor, Moneda.COP_TO_EUR.getFactor());
                case "Peso Colombia a Libra":
                    return monedasLocales.convertir(valor, Moneda.COP_TO_GBP.getFactor());
                case "Peso Colombia a Yen":
                    return monedasLocales.convertir(valor, Moneda.COP_TO_JPY.getFactor());
                case "Peso Colombia a Wom":
                    return monedasLocales.convertir(valor, Moneda.COP_TO_WON.getFactor());
                case "Dólar a Peso Colombia":
                    return monedasExtranjeras.convertir(valor, Moneda.USD_TO_COP.getFactor());
                case "Euro a Peso Colombia":
                    return monedasExtranjeras.convertir(valor, Moneda.EUR_TO_COP.getFactor());
                case "Libra a Peso Colombia":
                    return monedasExtranjeras.convertir(valor, Moneda.GBP_TO_COP.getFactor());
                case "Yen a Peso Colombia":
                    return monedasExtranjeras.convertir(valor, Moneda.JPY_TO_COP.getFactor());
                case "Wom a Peso Colombia":
                    return monedasExtranjeras.convertir(valor, Moneda.WOM_TO_COP.getFactor());
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
