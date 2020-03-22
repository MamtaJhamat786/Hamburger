package com.mamtaUdemy;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger=new Hamburger("basic", "sausage", 3.56, "white");
	    hamburger.addHamburgerAddition1("tomato",0.34);
	    hamburger.addHamburgerAddition2("cream",0.34);
	    hamburger.addHamburgerAddition3("onion", 1.23);
	    hamburger.addHamburgerAddition4("cocumber", 0.56);
	    System.out.println(" Total burger Price is "+ hamburger.itemizeburger());

	    HealthyBurger healthyBurger=new HealthyBurger("Bacon", 4.78);
	    healthyBurger.addHamburgerAddition1("Egg", 5.67);
			healthyBurger.addHamburgerAddition2("chicken",6.45);
	    healthyBurger.itemizeburger();
			System.out.println("Total healthy burger price is "+ healthyBurger.itemizeburger());

			DeluxeHamburger db=new DeluxeHamburger();
			db.addHamburgerAddition1("cocumber", 3.45);
			db.itemizeburger();



    }
}
