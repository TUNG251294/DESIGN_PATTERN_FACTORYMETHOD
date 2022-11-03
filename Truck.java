public class Truck implements Transport{
    private String name;
    private int taitrong;

    public Truck() {
    }

    public Truck(String name, int taitrong) {
        this.name = name;
        this.taitrong = taitrong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaitrong() {
        return taitrong;
    }

    public void setTaitrong(int taitrong) {
        this.taitrong = taitrong;
    }

    @Override
    public void move() {
        System.out.println("Truck is moving");
    }

    @Override
    public void checkHanhtrinh() {
        System.out.println("Check hanh trinh");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", taitrong=" + taitrong +
                '}';
    }
}
