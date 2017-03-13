public class Car {
  private String brand;
  private String model;
  private Engine engine;
  
  public Car(String brand, String model,
    Engine engine) {

    this.brand = brand;
    this.model = model;
    this.engine = engine;
  }

  public void print() {
    System.out.println("The brand is: " + this.brand);
    System.out.println("The model is: " + this.model);
    System.out.println(engine);
  }

  // public String toString()
  // {
  //   return brand + " " +  model + " " + engine;
  // }


}