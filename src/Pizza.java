public class Pizza {
    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private String tipo_salsa;
    private boolean cebolla;
    private boolean sin_gluten;
    private boolean extra_queso;
    private  boolean piña;
    private boolean champiñones;
    private boolean jamon;

    public Pizza(String masa, boolean relleno, int tipo, boolean salsa, String tipo_salsa, boolean cebolla, boolean sin_gluten, boolean extra_queso, boolean piña, boolean champiñones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
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
                ", tipo=" + tipo +
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
}
