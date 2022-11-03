public class Ship implements Transport{
    private String name;
    private double taitrong;
    private double sucgio;

    public Ship() {
    }

    public Ship(String name, double taitrong, double sucgio) {
        this.name = name;
        this.taitrong = taitrong;
        this.sucgio = sucgio;
    }

    public double getSucgio() {
        return sucgio;
    }

    public void setSucgio(double sucgio) {
        this.sucgio = sucgio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaitrong() {
        return taitrong;
    }

    public void setTaitrong(double taitrong) {
        this.taitrong = taitrong;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", taitrong=" + taitrong +
                ", sucgio=" + sucgio +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Ship is moving");
    }

    @Override
    public void checkHanhtrinh() {
        System.out.println("check ship hanh trinh");
    }
}
