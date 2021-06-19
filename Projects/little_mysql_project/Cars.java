package little_mysql_project;

public class Cars {

    private int id;
    private String name;
    private int price;
    private double engine_volume;

    public Cars() {
    }

    public Cars(int id, String name, int price, double engine_volume) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.engine_volume = engine_volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getEngine_volume() {
        return engine_volume;
    }

    public void setEngine_volume(double engine_volume) {
        this.engine_volume = engine_volume;
    }

    public String toString(){
        return this.id + ") " + this.name + " has a price " + this.price + " and engine volume " + this.engine_volume;
    }
}
