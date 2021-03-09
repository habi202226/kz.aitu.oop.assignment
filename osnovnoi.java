package kz.aitu.oop.assignment6;

public class osnovnoi{

  public static void main(String[] args) {
	  
    Logistika first = createLogistics("Truck");
    Transport t = first.createTransport();
   
    first.planDelivery();
    t.deliver();
  }
  public static Logistika createLogistics(String transport){
    switch (transport) {
    
    case "Ship" : return  new Navodnayalogistika();
    case "Truck" : return  new Dorozhnayalogistika();
    
    default: return null;//
    }
    
  };
}