public class BuilderPizzas {
    private Pizzas _pizza;

    public Pizzas build() {
        return this._pizza;
    }

    public BuilderPizzas() {
        _pizza = new Pizzas();
    }

    public BuilderPizzas setTipoMasa(int tipoMasa) {
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }

    public BuilderPizzas setSize(int size) {
        _pizza.setSize(size);
        return this;
    }

    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRellena(relleno);
        return this;
    }

    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizzas setRecojida(int recojida) {
        _pizza.setRecojida(recojida);
        return this;
    }

    public BuilderPizzas setSalsa(boolean salsa) {
        _pizza.setSalsa(salsa);
        return this;
    }

    public BuilderPizzas setTipoSalsa(String tipoSalsa) {
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    public BuilderPizzas setExtraQueso(boolean extraQueso) {
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    public BuilderPizzas setPiña(boolean piña) {
        _pizza.setPiña(piña);
        return this;
    }

    public BuilderPizzas setChampiñones(boolean champiñones) {
        _pizza.setChampiñones(champiñones);
        return this;
    }

    public BuilderPizzas setJamon(boolean jamon) {
        _pizza.setJamon(jamon);
        return this;
    }
}
