public class Main {

    public static void main(String[] args) {

        Pizzas pizza_1 = new BuilderPizzas().build(); //pizza por defecto//

        Pizzas Barbacoa = new BuilderPizzas()
                .setRecojida(Pizzas.PARALLEVAR)
                .setTipoMasa(Pizzas.PAN)
                .setCebolla(false)
                .setSize(Pizzas.SMALL)
                .build(); //sin esto no es tipo Pizza y da fallo//


        System.out.println(pizza_1.toString() + "\n" + "y" + "\n" + Barbacoa.toString());


    }

}
