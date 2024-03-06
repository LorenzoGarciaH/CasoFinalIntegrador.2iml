public class habitats_Aviarios extends habitats{
    public habitats_Aviarios(Boolean limpio, float temperatura, float humedad) {
        super(limpio, temperatura, humedad);
    }
    public void monitorConditions() {
        System.out.println("Monitorizando las condiciones del habitat aviario");

    }
}
