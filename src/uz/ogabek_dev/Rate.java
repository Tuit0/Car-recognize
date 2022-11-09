package uz.ogabek_dev;

public class Rate {
    private Integer isSimilar;
    private Integer value;

    public Rate() {
    }

    public Rate(Integer value) {
        this.value = value;
    }

    public Rate(Integer isSimilar, Integer value) {
        this.isSimilar = isSimilar;
        this.value = value;
    }

    public Integer getIsSimilar() {
        return isSimilar;
    }

    public void setIsSimilar(Integer isSimilar) {
        this.isSimilar = isSimilar;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "degree=" + isSimilar +
                ", value=" + value +
                '}';
    }
}
