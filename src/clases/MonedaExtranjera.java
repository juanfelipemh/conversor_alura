package clases;

import exceptions.ValorExcepcion;

public class MonedaExtranjera {

    private Double USD_TO_COP = 4168.52;
    private Double EUR_TO_COP = 4600.85;
    private Double GBP_TO_COP = 5384.89;
    private Double JPY_TO_COP = 29.71;
    private Double WOM_TO_COP = 3.24;

    public double convertirUsdCop(double valor) throws ValorExcepcion {
        if(valor < 0){
            throw new ValorExcepcion("Ingresaste un valor negativo");
        }
        return valor * this.USD_TO_COP;
    }

    public double convertirEurCop(double valor) throws ValorExcepcion {
        if(valor < 0){
            throw new ValorExcepcion("Ingresaste un valor negativo");
        }
        return valor * this.EUR_TO_COP;
    }

    public double convertirGbpCop(double valor) throws ValorExcepcion {
        if(valor < 0){
            throw new ValorExcepcion("Ingresaste un valor negativo");
        }
        return valor * this.GBP_TO_COP;
    }

    public double convertirJpyCop(double valor) throws ValorExcepcion {
        if(valor < 0){
            throw new ValorExcepcion("Ingresaste un valor negativo");
        }
        return valor * this.JPY_TO_COP;
    }

    public double convertirWonCop(double valor) throws ValorExcepcion {
        if(valor < 0){
            throw new ValorExcepcion("Ingresaste un valor negativo");
        }
        return valor * this.WOM_TO_COP;
    }
}
