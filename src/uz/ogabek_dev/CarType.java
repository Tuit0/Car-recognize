package uz.ogabek_dev;

public class CarType {
    private Integer classId;
    private String epsilonBuying;
    private String epsilonMaint;
    private String epsilonDoors;
    private String epsilonPersons;
    private String epsilonLugBoot;
    private String epsilonSafety;
    private Integer maxCount;

    public CarType() {
    }

    public CarType(Integer classId) {
        this.classId = classId;
    }

    public CarType(Integer classId,
                   String epsilonBuying,
                   String epsilonMaint,
                   String epsilonDoors,
                   String epsilonPersons,
                   String epsilonLugBoot,
                   String epsilonSafety,
                   Integer maxCount) {
        this.classId = classId;
        this.epsilonBuying = epsilonBuying;
        this.epsilonMaint = epsilonMaint;
        this.epsilonDoors = epsilonDoors;
        this.epsilonPersons = epsilonPersons;
        this.epsilonLugBoot = epsilonLugBoot;
        this.epsilonSafety = epsilonSafety;
        this.maxCount = maxCount;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getEpsilonBuying() {
        return epsilonBuying;
    }

    public void setEpsilonBuying(String epsilonBuying) {
        this.epsilonBuying = epsilonBuying;
    }

    public String getEpsilonMaint() {
        return epsilonMaint;
    }

    public void setEpsilonMaint(String epsilonMaint) {
        this.epsilonMaint = epsilonMaint;
    }

    public String getEpsilonDoors() {
        return epsilonDoors;
    }

    public void setEpsilonDoors(String epsilonDoors) {
        this.epsilonDoors = epsilonDoors;
    }

    public String getEpsilonPersons() {
        return epsilonPersons;
    }

    public void setEpsilonPersons(String epsilonPersons) {
        this.epsilonPersons = epsilonPersons;
    }

    public String getEpsilonLugBoot() {
        return epsilonLugBoot;
    }

    public void setEpsilonLugBoot(String epsilonLugBoot) {
        this.epsilonLugBoot = epsilonLugBoot;
    }

    public String getEpsilonSafety() {
        return epsilonSafety;
    }

    public void setEpsilonSafety(String epsilonSafety) {
        this.epsilonSafety = epsilonSafety;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "classId=" + classId +
                ", epsilonBuying='" + epsilonBuying + '\'' +
                ", epsilonMaint='" + epsilonMaint + '\'' +
                ", epsilonDoors='" + epsilonDoors + '\'' +
                ", epsilonPersons='" + epsilonPersons + '\'' +
                ", epsilonLugBoot='" + epsilonLugBoot + '\'' +
                ", epsilonSafety='" + epsilonSafety + '\'' +
                ", maxCount=" + maxCount +
                '}';
    }
}
