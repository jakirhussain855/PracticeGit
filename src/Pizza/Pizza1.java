package Pizza;
public class Pizza1{


        String pizzatype="Dominos Pizza";
        int Price=44;
        double tax=11;
        double total;
        boolean isharam=false;
        boolean istesty=true;
        char pizzasize= 'L';



        String topping="mix vegitable and chicken";
        public void recieveorderforpizza(char pizzasize,String topping) {
            System.out.println("Recive order for pizza " + pizzasize +" " + topping);
        }
        public void eatpizza(){
            System.out.println("eat the pizza");
        }







}
