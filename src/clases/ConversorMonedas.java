package clases;

import exceptions.ValorExcepcion;

import javax.swing.*;

public class ConversorMonedas {

    private MonedaLocal monedaLocal = new MonedaLocal();
    private MonedaExtranjera monedaExtranjera = new MonedaExtranjera();
    private String[] opciones = {"Peso Colombia a Dólar", "Peso Colombia a Euro", "Peso Colombia a Libra", "Peso Colombia a Yen", "Peso Colombia a Wom",
            "Dólar a Peso Colombia", "Euro a Peso Colombia", "Libra a Peso Colombia", "Yen a Peso Colombia", "Wom a Peso Colombia"};

    public void ConversorMonedas () {
        Double valor;

        String opcion = (JOptionPane.showInputDialog(null, "Selecciona una divisa", "Conversión de divisas",
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Seleccion")).toString();

        switch (opcion) {
            case "Peso Colombia a Dólar":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaLocal.convertirCopUsd(valor);
                    JOptionPane.showMessageDialog(null, "COP a USD: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;

            case "Peso Colombia a Euro":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaLocal.convertirCopEur(valor);
                    JOptionPane.showMessageDialog(null, "COP a EUR: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;

            case "Peso Colombia a Libra":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaLocal.convertirCopGbp(valor);
                    JOptionPane.showMessageDialog(null, "COP a GBP: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;

            case "Peso Colombia a Yen":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaLocal.convertirCopJpy(valor);
                    JOptionPane.showMessageDialog(null, "COP a JPY: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;

            case "Peso Colombia a Wom":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaLocal.convertirCopWom(valor);
                    JOptionPane.showMessageDialog(null, "COP a WOM: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;

            case "Dólar a Peso Colombia":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaExtranjera.convertirUsdCop(valor);
                    JOptionPane.showMessageDialog(null, "USD a COP: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;

            case "Euro a Peso Colombia":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaExtranjera.convertirEurCop(valor);
                    JOptionPane.showMessageDialog(null, "EUR a COP: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;

            case "Libra a Peso Colombia":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaExtranjera.convertirGbpCop(valor);
                    JOptionPane.showMessageDialog(null, "GBP a COP: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;

            case "Yen a Peso Colombia":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaExtranjera.convertirJpyCop(valor);
                    JOptionPane.showMessageDialog(null, "JPY a COP: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;

            case "Wom a Peso Colombia":
                valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor:"));
                try {
                    Double resultado = monedaExtranjera.convertirWonCop(valor);
                    JOptionPane.showMessageDialog(null, "WOM a COP: " + String.format("%.2f",resultado));
                } catch (ValorExcepcion e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                };
                break;
        }
    }

}
