package clases;

import exceptions.ValorExcepcion;
import interfaces.ConversorMoneda;

public class MonedasExtranjeras implements ConversorMoneda {

    @Override
    public Double convertir(Double valor, Double trm) throws ValorExcepcion {
        return valor * trm;
    }
}
