package clases;

public class Temperatura {

    public Double celciusaFahrenheit(Double temperatura)  {
        if(Double.isNaN(temperatura)){
            throw new NumberFormatException("Valor ingreso es un texto");
        }
        return (temperatura * 9/5) + 32;
    }

    public Double FahrenheitaCelcius(Double temperatura){
        if(Double.isNaN(temperatura)){
            throw new NumberFormatException("Valor ingreso es un texto");
        }
        return (temperatura - 32) * 5/9;
    }
}
