import java.util.Objects;

public class Computer {
    String model;
    int yearOfPoduct;
    int OzuAmount;
    int TotalPrice;
    Hard hard;
    CountryProducer computerProducer;
    CProcessor processor;

    public Computer() {}

    public Computer(String model, int yearOfPoduct, int ozuAmount, int totalPrice, Hard hard, CountryProducer computerProducer, CProcessor processor) {
        this.model = model;
        this.yearOfPoduct = yearOfPoduct;
        OzuAmount = ozuAmount;
        TotalPrice = totalPrice;
        this.hard = hard;
        this.computerProducer = computerProducer;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfPoduct() {
        return yearOfPoduct;
    }

    public void setYearOfPoduct(int yearOfPoduct) {
        this.yearOfPoduct = yearOfPoduct;
    }

    public int getOzuAmount() {
        return OzuAmount;
    }

    public void setOzuAmount(int ozuAmount) {
        OzuAmount = ozuAmount;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    public Hard getHard() {
        return hard;
    }

    public void setHard(Hard hard) {
        this.hard = hard;
    }

    public CountryProducer getComputerProducer() {
        return computerProducer;
    }

    public void setComputerProducer(CountryProducer computerProducer) {
        this.computerProducer = computerProducer;
    }

    public CProcessor getProcessor() {
        return processor;
    }

    public void setProcessor(CProcessor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", yearOfPoduct=" + yearOfPoduct +
                ", OzuAmount=" + OzuAmount +
                ", TotalPrice=" + TotalPrice +
                ", hard=" + hard +
                ", computerProducer=" + computerProducer +
                ", processor=" + processor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getYearOfPoduct() == computer.getYearOfPoduct() &&
                getOzuAmount() == computer.getOzuAmount() &&
                getTotalPrice() == computer.getTotalPrice() &&
                Objects.equals(getModel(), computer.getModel()) &&
                Objects.equals(getHard(), computer.getHard()) &&
                getComputerProducer() == computer.getComputerProducer() &&
                Objects.equals(getProcessor(), computer.getProcessor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getModel(), getYearOfPoduct(), getOzuAmount(), getTotalPrice(), getHard(), getComputerProducer(), getProcessor());
    }
}
