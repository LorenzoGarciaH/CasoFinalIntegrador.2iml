public class habitats {
    protected Boolean limpio;
    protected float temperatura;
    protected  float humedad;
    public void monitorConditions() {
        System.out.println("Monitorizando las condiciones del habitat");
    }
    public habitats(Boolean limpio, float temperatura, float humedad) {
        this.limpio = limpio;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

}
