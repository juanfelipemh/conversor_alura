package clases.temperatura;

import exceptions.ValorExcepcion;
import interfaces.ConversorTemperatura;

public class Celcius implements ConversorTemperatura {
    @Override
    public Double convertir(Double temperatura) throws ValorExcepcion {
        return (temperatura - 32) * 5/9;
    }
}
