package PurchasedLaptopFromAmazon;

public class priceNInfo {
    public static void main(String[] args){

        String buy="Khoyer went to buy laptop and he did buy and he think he did a good job! ";
        int priceofLaptop=600;
        int discount=50;
        double tax=51.34;
        double total=0.0;
        String good="which is best you can find in market";
        boolean didGoodJob;
        didGoodJob=true;
        boolean isItTrue;

        isItTrue=true;

        double originalPrice=0;
        originalPrice=tax+priceofLaptop;




         total= priceofLaptop +  tax- discount;
        System.out.println(buy);


        System.out.println("Original price of laptop is "+originalPrice);

        System.out.println("Price of laptop Khoyer vaio paid " +total  + '$' +" "+ good);
        System.out.println(didGoodJob);
        System.out.println("w");
    }
}
