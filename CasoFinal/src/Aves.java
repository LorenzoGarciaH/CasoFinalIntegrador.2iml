public class Aves extends Animales{
    private String tipo_ave;
    public Aves(String nombre, String tipo_ave){
        super(nombre);
        this.tipo_ave = tipo_ave;
    }
    public String getTipo_ave(){
        return tipo_ave;
    }
    public void setTipo_ave(String tipo_ave){
        this.tipo_ave = tipo_ave;
    }
    public Aves(String especies) {
        super(especies);
    }
}
