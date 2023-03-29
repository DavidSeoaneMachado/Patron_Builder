public class BuilderPizzas {

    // este es el objeto que va a construir nuestro Builder
    // utilizamos el guion bajo para remarcar que es un objeto de esta clase
    private Pizzas _pizza;

    // metodo que devuelve el objeto terminado
    public Pizzas build() {
        return this._pizza;
    }

    // crea la pizza para configurarla
    public BuilderPizzas() {
        _pizza = new Pizzas();
    }

    /**
     * Metodos para la personalizacion de la pizza. Si queremos crear una Barbacoa por ejemplo creamos un
     * metodo .setBarbacoa que modifique la pizza para darle los atributos de una barbacoa
     */
    public BuilderPizzas setTipoMasa(int tipoMasa) {
        _pizza.setMasa(tipoMasa);
        return this;
    }

    public BuilderPizzas setSize(int size) {
        _pizza.setTamaño(size);
        return this;
    }

    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSinGluten(boolean sinGluten) {
        _pizza.setSin_gluten(sinGluten);
        return this;
    }

    public BuilderPizzas setRecojida(int recojida) {
        _pizza.setRecogida(recojida);
        return this;
    }
}

