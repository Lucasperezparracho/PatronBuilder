public class Main {
    public static void main(String[] args) {
        Pizzas pizzaDefault = new Pizzas();
        Pizzas pizzaAmedida = new Pizzas(Pizzas.FINA, Pizzas.BIG, true, false, true, Pizzas.PAN);

        BuilderPizzas miBuilder = new BuilderPizzas();
        miBuilder.setCebolla(true);
        miBuilder.setSize(Pizzas.BIG);
        pizzaDefault = miBuilder.build();

        System.out.println(pizzaDefault.toString());

        Pizzas creadaConBuilder = new BuilderPizzas().build();
        Pizzas sintaxisEncadenada = new BuilderPizzas()
                .setCebolla(true)
                .setSize(Pizzas.BIG)
                .build();

        System.out.println(creadaConBuilder.toString());
        System.out.println(sintaxisEncadenada.toString());
    }
}
