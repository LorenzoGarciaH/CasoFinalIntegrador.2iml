public class habitat_terrestres extends habitats{
    public habitat_terrestres(Boolean limpio, float temperatura, float humedad) {
        super(limpio, temperatura, humedad);
    }
    public void monitorConditions() {
        System.out.println("Monitorizando las condiciones del habitat terrestre");

    }
}
