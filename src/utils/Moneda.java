package utils;

public enum Moneda {
    COP_TO_USD(4168.52),
    COP_TO_EUR(4600.85),
    COP_TO_GBP(5384.89),
    COP_TO_JPY(29.71),
    COP_TO_WON(3.24),
    USD_TO_COP(4168.52),
    EUR_TO_COP(4600.85),
    GBP_TO_COP(5384.89),
    JPY_TO_COP(29.71),
    WOM_TO_COP(3.24);

    private final double factor;

    Moneda(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
}
