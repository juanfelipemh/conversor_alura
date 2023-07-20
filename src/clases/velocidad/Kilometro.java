package clases.velocidad;

import exceptions.ValorExcepcion;
import interfaces.ConversorVelocidad;

public class Kilometro implements ConversorVelocidad {
    @Override
    public Double convertirDistancia(Double distancia) throws ValorExcepcion {
        return distancia * 1.609;
    }
}
