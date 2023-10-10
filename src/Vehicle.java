public abstract class Vehicle {

    private final String model;
    private final String licensePlate;
    private long start;
    private long end;

    public Vehicle(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;

    }
    public String getLicensePlate() {
        return licensePlate;

    }

    public long getStart() {
        return start;

    }
    public void setStart() {
        this.start = System.currentTimeMillis();

    }

    public long getEnd() {
        return end;
    }
    public void setEnd() {
        this.end = System.currentTimeMillis();

    }

}
