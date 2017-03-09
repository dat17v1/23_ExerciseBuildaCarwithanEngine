public class Engine {
  private double size;
  private String code;
  private int horsepower;

  public Engine(double eS, String eC, int hp) {
    size = eS;
    code = eC;
    horsepower = hp;
  }
  public String toString() {
    return "Size: " + size + ", code: " + code + 
      ", horse: " + horsepower;
  }
}