public class Lamp {
    private boolean battery;
    private int globRating;
    private LampType lampType;

    public Lamp(boolean battery, int globRating, LampType lampType) {
        this.battery = battery;
        this.globRating = globRating;
        this.lampType = lampType;
    }

    public LampType getStyle(){
        return lampType;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobalRating(){
        return globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "battery=" + battery +
                ", globRating=" + globRating +
                ", lampType=" + lampType +
                '}';
    }
}
