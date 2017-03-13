public class Engine {
  private String size;
  private String code;
  private String horsepower;

  public Engine(String eS, String eC, String hp) {
    size = eS;
    code = eC;
    horsepower = hp;
  }
  public String toString() {
    return "Size: " + size + ", code: " + code + 
      ", horse: " + horsepower;
  }
}