package kz.aitu.oop.assignment6;

public class Navodnayalogistika extends Logistika{
	
  public Transport createTransport() {return new Korablik();};
  
  public void planDelivery () {System.out.println("The delivery address is remote and fenced off by the sea. I choose sea delivery");};
}