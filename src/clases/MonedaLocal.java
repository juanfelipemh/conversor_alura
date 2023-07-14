package clases;

import exceptions.ValorExcepcion;

public class MonedaLocal {

     private Double COP_TO_USD = 4168.52;
     private Double COP_TO_EUR = 4600.85;
     private Double COP_TO_GBP = 5384.89;
    private Double COP_TO_JPY = 29.71;
    private Double COP_TO_WON = 3.24;

     public double convertirCopUsd(double valor) throws ValorExcepcion {
         if(valor < 0){
             throw new ValorExcepcion("Ingresaste un valor negativo");
         }
         return valor / this.COP_TO_USD;
     }

    public double convertirCopEur(double valor) throws ValorExcepcion {
        if(valor < 0){
            throw new ValorExcepcion("Ingresaste un valor negativo");
        }
        return valor / this.COP_TO_EUR;
    }

    public double convertirCopGbp(double valor) throws ValorExcepcion {
        if(valor < 0){
            throw new ValorExcepcion("Ingresaste un valor negativo");
        }
        return valor / this.COP_TO_GBP;
    }

    public double convertirCopJpy(double valor) throws ValorExcepcion {
        if(valor < 0){
            throw new ValorExcepcion("Ingresaste un valor negativo");
        }
        return valor / this.COP_TO_JPY;
    }

    public double convertirCopWom(double valor) throws ValorExcepcion {
        if(valor < 0){
            throw new ValorExcepcion("Ingresaste un valor negativo");
        }
        return valor / this.COP_TO_WON;
    }
}
