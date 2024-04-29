import java.util.Objects;

public class Computer{
    private String brand;
    private String colour;
    private String operatingSystem;
    private int randomAccessMemory;
    private double screenDiagonal;

    public Computer(String brand, String colour, String operatingSystem, int randomAccessMemory, double screenDiagonal){
        this.brand = brand;
        this.colour = colour;
        this.operatingSystem = operatingSystem;
        this.randomAccessMemory = randomAccessMemory;
        this.screenDiagonal = screenDiagonal;
    }

    public String getBrand(){
        return brand;
    }

    public String getColour(){
        return colour;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public int getRandomAccessMemory(){
        return randomAccessMemory;
    }

    public double getScreenDiagonal(){
        return screenDiagonal;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setOperatingSystem(String OperatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public void setRandomAccessMemory(int randomAccessMemory){
        this.randomAccessMemory = randomAccessMemory;
    }

    public void setScreenDiagonal(double screenDiagonal){
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return "Бренд: " + brand + "; Цвет: " + colour +
                "; Операционная система: " + operatingSystem +
                "; Оперативная память: " + randomAccessMemory + " ГБ" +
                "; Диагональ экрана: " + screenDiagonal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return  true;
        if ( obj == null || getClass() != obj.getClass())
            return false;
        Computer computer = (Computer) obj;
        return brand.equals(computer.brand) && colour.equals(computer.colour) &&
                operatingSystem.equals(computer.operatingSystem) && randomAccessMemory == computer.randomAccessMemory &&
                screenDiagonal == computer.screenDiagonal;

    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, colour, operatingSystem, randomAccessMemory, screenDiagonal);
    }
}