public class Main {

    public static void main(String[] args) {

        Pizzas pizza_1 = new BuilderPizzas().build(); //pizza por defecto// instancio el builder//

        Pizzas Barbacoa = new BuilderPizzas() //personalizo la pizza//
                .setRecojida(Pizzas.PARALLEVAR)
                .setTipoMasa(Pizzas.PAN)
                .setCebolla(false)
                .setSize(Pizzas.SMALL)
                .build(); //sin esto no es tipo Pizza y da fallo// Recojo la pizza//


        System.out.println(pizza_1.toString() + "\n" + "y" + "\n" + Barbacoa.toString());


    }

}
