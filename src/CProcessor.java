import java.util.Objects;

public class CProcessor {
    int cores;
    double frequency;
    CountryProducer CentProcProd;

    public CProcessor() {
    }

    public CProcessor(int cores, double frequency, CountryProducer centProcProd) {
        this.cores = cores;
        this.frequency = frequency;
        CentProcProd = centProcProd;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public CountryProducer getCentProcProd() {
        return CentProcProd;
    }

    public void setCentProcProd(CountryProducer centProcProd) {
        CentProcProd = centProcProd;
    }

    @Override
    public String toString() {
        return "CProcessor{" +
                "cores=" + cores +
                ", frequency=" + frequency +
                ", CentProcProd=" + CentProcProd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CProcessor)) return false;
        CProcessor that = (CProcessor) o;
        return getCores() == that.getCores() &&
                Double.compare(that.getFrequency(), getFrequency()) == 0 &&
                getCentProcProd() == that.getCentProcProd();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCores(), getFrequency(), getCentProcProd());
    }
}