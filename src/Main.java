public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("Fina", true, 2,  true, "Nop", false, false, true, true, false, true);

        Pizza pizza2 = new Pizza("Gruesa", true, 1,  true, "SIp", false, false, true, true, false, true);

        Pizza pizza3 = new Pizza("Gruesa", false, 1,  false, "SIp", true, true, false, false, false, true);

        System.out.println(pizza);
        System.out.println(pizza2);
        System.out.println(pizza3);

    }

}
