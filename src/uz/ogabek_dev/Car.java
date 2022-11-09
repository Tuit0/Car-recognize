package uz.ogabek_dev;

public class Car {
    private Rate buying;
    private Rate maint;
    private Rate doors;
    private Rate persons;
    private Rate lugBoot;
    private Rate safety;
    private CarType k;

    public Car() {
    }

    public Car(Integer buying, Integer maint, Integer doors, CarType k) {
        this.buying = new Rate(buying);
        this.maint = new Rate(maint);
        this.doors = new Rate(doors);
        this.k = k;
    }

    public Car(Rate buying, Rate maint, Rate doors, Rate persons, Rate lugBoot, Rate safety, CarType k) {
        this.buying = buying;
        this.maint = maint;
        this.doors = doors;
        this.persons = persons;
        this.lugBoot = lugBoot;
        this.safety = safety;
        this.k = k;
    }

    public Rate getBuying() {
        return buying;
    }

    public void setBuying(Rate buying) {
        this.buying = buying;
    }

    public Rate getMaint() {
        return maint;
    }

    public void setMaint(Rate maint) {
        this.maint = maint;
    }

    public Rate getDoors() {
        return doors;
    }

    public void setDoors(Rate doors) {
        this.doors = doors;
    }

    public CarType getK() {
        return k;
    }

    public void setK(CarType k) {
        this.k = k;
    }

    public Rate getPersons() {
        return persons;
    }

    public void setPersons(Rate persons) {
        this.persons = persons;
    }

    public Rate getLugBoot() {
        return lugBoot;
    }

    public void setLugBoot(Rate lugBoot) {
        this.lugBoot = lugBoot;
    }

    public Rate getSafety() {
        return safety;
    }

    public void setSafety(Rate safety) {
        this.safety = safety;
    }

    @Override
    public String toString() {
        return "Car{" +
                "buying=" + buying +
                ", maint=" + maint +
                ", doors=" + doors +
                ", persons=" + persons +
                ", lugBoot=" + lugBoot +
                ", safety=" + safety +
                ", k=" + k +
                '}';
    }
}
