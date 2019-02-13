public class ElkaToy {
    private int number;
    private String name;
    private String colour;

     ElkaToy(int number, String name, String colour) {
        this.number = number;
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return  "Игрушка № " + number +
                ", имя " + name +
                ", цвет " + colour;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
