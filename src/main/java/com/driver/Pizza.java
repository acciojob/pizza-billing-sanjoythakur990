package com.driver;

public class Pizza {
    public int cheesePrice;
    public int basePrice;
    public int toppingsPrice;
    public int paperBagPrice;

    private int price;
    private Boolean isVeg;
//    private String bill;
    public String bill;
    public int totalPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            basePrice=300;
            toppingsPrice=70;
        }
        else{ // in case of non-veg
            basePrice=400;
            toppingsPrice=120;
        }
        cheesePrice=80;
        paperBagPrice=20;
        totalPrice=basePrice;    // initializing the totalPrice as the basePrice
        bill="Base Price Of The Pizza "+basePrice+"\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.totalPrice=totalPrice+cheesePrice;
            isCheeseAdded=true;  // to prevent it from adding again
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            totalPrice+=toppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            totalPrice+=paperBagPrice;
            isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated) {
            if(isCheeseAdded)
                bill+="Extra Cheese Added: "+cheesePrice+"\n";
            if(isToppingsAdded)
                bill+="Extra Toppings Added: "+toppingsPrice+"\n";
            if(isPaperBagAdded)
                bill+="Paperbag Added: "+paperBagPrice+"\n";
            bill+="Total Price: "+totalPrice+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
