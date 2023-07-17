package clases.temperatura;

import exceptions.ValorExcepcion;
import interfaces.ConversorTemperatura;

public class Fahrenheit implements ConversorTemperatura {

    @Override
    public Double convertir(Double temperatura) throws ValorExcepcion {
        return (temperatura * 9/5) + 32;
    }
}
