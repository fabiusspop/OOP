package L40_CopyObjects;

public class Car {
    private String make;
    private String model;
    private int year;

    Car (String make, String model, int year)
    {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Car(Car x)
    {
        this.copy(x);
    }
    public void copy(Car x)
    {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    }
}
