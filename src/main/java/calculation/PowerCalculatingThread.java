package main.java.calculation;

import java.math.BigInteger;

public class PowerCalculatingThread extends Thread {

    private BigInteger result = BigInteger.ONE;
    private final BigInteger base;
    private final BigInteger power;

    public PowerCalculatingThread(BigInteger base, BigInteger power) {
        this.base = base;
        this.power = power;
    }

    @Override
    public void run() {
        for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(base);
        }
    }

    public BigInteger getResult() {
        return result;
    }
}
