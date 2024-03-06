public class mamiferos extends Animales{
    private String tipo_mamifero;
    public mamiferos(String nombre, String tipo_mamifero){
        super(nombre);
        this.tipo_mamifero = tipo_mamifero;
    }
    public String getTipo_mamifero(){
        return tipo_mamifero;
    }
    public void setTipo_mamifero(String tipo_mamifero){
        this.tipo_mamifero = tipo_mamifero;
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Tipo de mamifero: "+getTipo_mamifero());
    }


}
