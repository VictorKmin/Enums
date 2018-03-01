import java.util.Objects;

public class Hard {
    String discModel;
    int discAmount;
    HardType hardType;

    public Hard() {
    }

    public Hard(String discModel, int discAmount, HardType hardType) {
        this.discModel = discModel;
        this.discAmount = discAmount;
        this.hardType = hardType;
    }

    public String getDiscModel() {
        return discModel;
    }

    public void setDiscModel(String discModel) {
        this.discModel = discModel;
    }

    public int getDiscAmount() {
        return discAmount;
    }

    public void setDiscAmount(int discAmount) {
        this.discAmount = discAmount;
    }

    public HardType getHardType() {
        return hardType;
    }

    public void setHardType(HardType hardType) {
        this.hardType = hardType;
    }

    @Override
    public String toString() {
        return "Hard{" +
                "discModel='" + discModel + '\'' +
                ", discAmount=" + discAmount +
                ", hardType=" + hardType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hard)) return false;
        Hard hard = (Hard) o;
        return getDiscAmount() == hard.getDiscAmount() &&
                Objects.equals(getDiscModel(), hard.getDiscModel()) &&
                getHardType() == hard.getHardType();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDiscModel(), getDiscAmount(), getHardType());
    }
}
