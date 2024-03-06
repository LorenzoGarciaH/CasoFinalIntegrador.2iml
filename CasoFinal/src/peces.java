public class peces extends Animales{
    private String tipo_pez;
    public peces(String nombre, String tipo_pez){
        super(nombre);
        this.tipo_pez = tipo_pez;
    }

    public peces(String species) {
        super(species);
    }
}
