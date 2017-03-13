
public class CarList {
 

 
  public static void main(String[] args) {
    
    Car[] carArray = new Car[3];

    for(int i = 0; i < carArray.length; i++)
    {

        System.out.print("What kind of brand should your car be of? : ");
        String brand = System.console().readLine();

        System.out.print("What kind of model should your " + brand + " be of?");
        String model = System.console().readLine();

        System.out.print("What size is your " + brand + "?");
        String size = System.console().readLine();

        System.out.print("What code is your "+ brand + " ? ");
        String code = System.console().readLine();

        System.out.print("How many horsepowers does you " + brand + " have? ");
        String hp = System.console().readLine();

          Engine engine1 = new Engine(size, code, hp);
          carArray[i] = new Car(brand, model, engine1);  
          
          
          //Car car1 = new Car(brand, model, engine1);
          //carArray[i] = car1;

    }

    for(int i = 0; i < carArray.length; i++)
    {
        carArray[i].print();
    }


    
  
    //  Engine engine1 = new Engine(size, code, hp);  
    // Car car1 = new Car(brand, model, engine1);
    // car1.print();


    // metode der returnerer en bil 
    // kald den 3 gange

    // loop
    // data ind i et array




    
    

  }
}
