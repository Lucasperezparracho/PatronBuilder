public class Pizzas {
    private int tipoMasa;
    private int size;
    private boolean rellena;
    private boolean cebolla;
    private boolean sinGluten;
    private int recojida;
    private boolean salsa;
    private String tipoSalsa;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;

    public static final int FINA = 0;
    public static final int PAN = 1;
    public static final int SMALL = 0;
    public static final int MEDIUM = 2;
    public static final int BIG = 3;
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    public Pizzas() {
        this.cebolla = true;
        this.recojida = TIENDA;
        this.rellena = false;
        this.sinGluten = false;
        this.size = MEDIUM;
        this.tipoMasa = FINA;
        this.salsa = false;
        this.tipoSalsa = "sin salsa";
        this.extraQueso = false;
        this.piña = false;
        this.champiñones = false;
        this.jamon = false;
    }

    public Pizzas(int tipoMasa, int size, boolean rellena, boolean cebolla, boolean sinGluten, int recojida) {
        this.tipoMasa = tipoMasa;
        this.size = size;
        this.rellena = rellena;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.recojida = recojida;
        this.salsa = false;
        this.tipoSalsa = "sin salsa";
        this.extraQueso = false;
        this.piña = false;
        this.champiñones = false;
        this.jamon = false;
    }

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isRellena() {
        return rellena;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public int getRecojida() {
        return recojida;
    }

    public void setRecojida(int recojida) {
        this.recojida = recojida;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
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

    @Override
    public String toString() {
        return "Pizzas{" +
                "tipoMasa=" + tipoMasa +
                ", size=" + size +
                ", rellena=" + rellena +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", recojida=" + recojida +
                ", salsa=" + salsa +
                ", tipoSalsa='" + tipoSalsa + '\'' +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon +
                '}';
    }
}
