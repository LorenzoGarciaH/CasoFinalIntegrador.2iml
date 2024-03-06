public class habitat_aquatico extends habitats{
    public habitat_aquatico(Boolean limpio, float temperatura, float humedad) {
        super(limpio, temperatura, humedad);
    }
    public void monitorConditions() {
        System.out.println("Monitorizando las condiciones del habitat acuatico");

    }
}
