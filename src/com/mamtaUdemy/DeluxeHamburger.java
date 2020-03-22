package com.mamtaUdemy;

public class DeluxeHamburger extends Hamburger{

  public DeluxeHamburger() {
    super("Deluxe", "sausages and meat", 14.45, "White");
    super.addHamburgerAddition1("chips", 2.74);
    super.addHamburgerAddition2("coca cola ", 1.45);
  }
  @Override
  public void addHamburgerAddition1(String name, double price) {
    System.out.println(" cannot add addition1 items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition2(String name, double price) {
    System.out.println(" cannot add addition2 items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition3(String name, double price) {
    System.out.println(" cannot add addition3 items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition4(String name, double price) {
    System.out.println(" cannot add addition4 items to a deluxe burger");

  }

}
