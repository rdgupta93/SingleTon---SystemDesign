package Strategy;

public class Main {
    public static void main(String[] args) {
        Maps maps = new Maps();
        maps.findPath("Banglore", "Patna" ,Mode.BIKE);
    }
}
