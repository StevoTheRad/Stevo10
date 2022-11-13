public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int mass = 75;// Масса тела в кг
        double height = 1.85;// Рост в метрах
        int indexMass = service.calculate(mass, height);
        System.out.println("Индекс массы тела - " + indexMass);
    }
}