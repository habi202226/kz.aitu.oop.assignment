package kz.aitu.oop.assignment6;

public class Dorozhnayalogistika extends Logistika{
	
  public Transport createTransport() {return new Gruzovik();};
  
  public void planDelivery () {System.out.println("The address is not far away, so I choose road delivery");};
}