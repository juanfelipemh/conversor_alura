package interfaces;

import exceptions.ValorExcepcion;

public interface ConversorTemperatura {

    Double convertir(Double temperatura) throws ValorExcepcion;
}
