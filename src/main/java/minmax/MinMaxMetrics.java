package main.java.minmax;

public class MinMaxMetrics {

    private volatile long minValue;
    private volatile long maxValue;

    public MinMaxMetrics() {
        minValue = Long.MIN_VALUE;
        minValue = Long.MAX_VALUE;
    }
    
    public void addSample(long sample) {
        synchronized(this) {
            minValue = Math.min(minValue, sample);
            maxValue = Math.max(maxValue, sample);
        }
    }

    public long getMin() {
        return minValue;
    }

    public long getMax() {
        return maxValue;
    }
}
