public class Pizzas {
    private int masa;
    private boolean relleno;
    private int tamaño;
    private int recogida;
    private boolean salsa;
    private String tipo_salsa;
    private boolean cebolla;
    private boolean sin_gluten;
    private boolean extra_queso;
    private  boolean piña;
    private boolean champiñones;
    private boolean jamon;

    // tipo de masa
    public static final int FINA = 0; // ESTO ES UN VALOR. SIN MAS. UN VALOR //
    public static final int PAN = 1;

    // tamaño de la pizza
    public static final int SMALL = 0;
    public static final int MEDIUM = 2;
    public static final int BIG = 3;

    // recogida
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    public Pizzas(){
        this.cebolla = true;
        this.relleno = false;
        this.extra_queso = true;
        this.tamaño = BIG;
        this.salsa = true;
        this.jamon = false;
        this.recogida = TIENDA;
    }


    public Pizzas(int masa, boolean relleno, int tamaño, boolean salsa, String tipo_salsa, boolean cebolla, boolean sin_gluten, boolean extra_queso, boolean piña, boolean champiñones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tamaño = tamaño;
        this.salsa = salsa;
        this.tipo_salsa = tipo_salsa;
        this.cebolla = cebolla;
        this.sin_gluten = sin_gluten;
        this.extra_queso = extra_queso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "masa='" + masa + '\'' +
                ", relleno=" + relleno +
                ", tipo=" + tamaño +
                ", salsa=" + salsa +
                ", tipo_salsa='" + tipo_salsa + '\'' +
                ", cebolla=" + cebolla +
                ", sin_gluten=" + sin_gluten +
                ", extra_queso=" + extra_queso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon +
                '}';
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getRecogida() {
        return recogida;
    }

    public void setRecogida(int recogida) {
        this.recogida = recogida;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipo_salsa() {
        return tipo_salsa;
    }

    public void setTipo_salsa(String tipo_salsa) {
        this.tipo_salsa = tipo_salsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSin_gluten() {
        return sin_gluten;
    }

    public void setSin_gluten(boolean sin_gluten) {
        this.sin_gluten = sin_gluten;
    }

    public boolean isExtra_queso() {
        return extra_queso;
    }

    public void setExtra_queso(boolean extra_queso) {
        this.extra_queso = extra_queso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }
}
