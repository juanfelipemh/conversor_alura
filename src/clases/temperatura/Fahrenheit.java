package clases.temperatura;

import exceptions.ValorExcepcion;
import interfaces.ConversorTemperatura;

public class Fahrenheit implements ConversorTemperatura {

    @Override
    public Double convertir(Double temperatura) throws ValorExcepcion {
        return (temperatura * 5/9) + 32;
    }

    public Double convertirFahrenheitAKelvin(Double temperatura) throws ValorExcepcion {
        return (temperatura - 32) * 5/9 + 273.15;
    }
}
