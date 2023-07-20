package clases.temperatura;

import exceptions.ValorExcepcion;
import interfaces.ConversorTemperatura;

public class Kelvin implements ConversorTemperatura {

    @Override
    public Double convertir(Double temperatura) throws ValorExcepcion {
        return temperatura - 273.15;
    }

    public Double convertirKelvinAFahrenheit(Double temperatura) throws ValorExcepcion {
        return (temperatura - 273.15) * 9/5 + 32;
    }
}
