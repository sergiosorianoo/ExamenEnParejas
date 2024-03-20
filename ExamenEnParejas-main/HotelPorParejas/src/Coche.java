public class Coche extends Vehiculo{

    //Atributos
    private int plazasMax, puertas;
    private float volMaletero;
    private String tipoCoche;

    //Metodos
    //Constructor
    public Coche(String matricula, String modelo, String marca, String tipoMotor, float kmRecorridos, float precioDia, int plazasMax, int puertas, float volMaletero, String tipoCoche) {
        super(matricula, modelo, marca, tipoMotor, kmRecorridos, precioDia);
        this.plazasMax = plazasMax;
        this.puertas = puertas;
        this.volMaletero = volMaletero;
        this.tipoCoche = tipoCoche;
    }

    //Getters and Setters
    public int getPlazasMax() {
        return plazasMax;
    }

    public void setPlazasMax(int plazasMax) {
        this.plazasMax = plazasMax;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getVolMaletero() {
        return volMaletero;
    }

    public void setVolMaletero(float volMaletero) {
        this.volMaletero = volMaletero;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    //Otros metodos
    

}
