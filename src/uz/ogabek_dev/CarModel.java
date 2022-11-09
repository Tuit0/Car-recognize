package uz.ogabek_dev;

public class CarModel {
    private String buying;
    private String maint;
    private String doors;
    private String persons;
    private String lugBoot;
    private String safety;
    private String status;

    public CarModel() {
    }

    public CarModel(String buying, String maint, String doors, String persons, String lugBoot, String safety, String status) {
        this.buying = buying;
        this.maint = maint;
        this.doors = doors;
        this.persons = persons;
        this.lugBoot = lugBoot;
        this.safety = safety;
        this.status = status;
    }

    public String getBuying() {
        return buying;
    }

    public void setBuying(String buying) {
        this.buying = buying;
    }

    public String getMaint() {
        return maint;
    }

    public void setMaint(String maint) {
        this.maint = maint;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getPersons() {
        return persons;
    }

    public void setPersons(String persons) {
        this.persons = persons;
    }

    public String getLugBoot() {
        return lugBoot;
    }

    public void setLugBoot(String lugBoot) {
        this.lugBoot = lugBoot;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "buying='" + buying + '\'' +
                ", maint='" + maint + '\'' +
                ", doors='" + doors + '\'' +
                ", persons='" + persons + '\'' +
                ", lugBoot='" + lugBoot + '\'' +
                ", safety='" + safety + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
