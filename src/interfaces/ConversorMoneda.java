package interfaces;

import exceptions.ValorExcepcion;

public interface ConversorMoneda {

    Double convertir(Double valor, Double trm) throws ValorExcepcion;

}
