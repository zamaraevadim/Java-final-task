public class Laptop {
    private int ram;
    private int HDD;
    private String OS;
    private String Color;

    public Laptop(int ram, int HDD, String OS, String color) {
        this.ram = ram;
        this.HDD = HDD;
        this.OS = OS;
        Color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", HDD=" + HDD +
                ", OS='" + OS + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
