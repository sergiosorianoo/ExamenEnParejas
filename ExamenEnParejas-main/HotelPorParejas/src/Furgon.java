public class Furgon extends Vehiculo{


    //Atributos
    private int cargaMax, plazas;

    //Metodos
    //Constructor
    public Furgon(String matricula, String modelo, String marca, String tipoMotor, float kmRecorridos, float precioDia, int cargaMax, int plazas) {
        super(matricula, modelo, marca, tipoMotor, kmRecorridos, precioDia);
        this.cargaMax = cargaMax;
        this.plazas = plazas;
    }

    //Getters and Setters

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }


    //Otros metodos
}
