public class TestAgregacion {
    public static void main(String[] args) {
        // Crear motores
        Motor motor1 = new Motor(12345, 3000);
        Motor motor2 = new Motor(67890, 2500);
        Motor motor3 = new Motor(54321, 3500);

        // Crear automóviles
        Automovil auto1 = new Automovil("ABC123", 4, "Toyota", "Corolla");
        Automovil auto2 = new Automovil("XYZ789", 2, "Honda", "Civic");
        Automovil auto3 = new Automovil("DEF456", 5, "Nissan", "Sentra");

        // Asignar motores a los automóviles (relación de agregación)
        auto1.setMotor(motor1);
        auto2.setMotor(motor2);
        auto3.setMotor(motor3);

        // Mostrar información de los automóviles
        System.out.println("=== INFORMACIÓN DE AUTOMÓVILES ===");
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());

        // Mostrar información específica de cada componente
        System.out.println("\n=== INFORMACIÓN DETALLADA ===");
        System.out.println("Auto 1 - Motor RPM: " + auto1.getMotor().getRevPorMin());
        System.out.println("Auto 2 - Número de Motor: " + auto2.getMotor().getNumMotor());
        System.out.println("Auto 3 - Marca: " + auto3.getMarca() + ", Modelo: " + auto3.getModelo());
    }
}
