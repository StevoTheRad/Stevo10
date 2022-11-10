public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int m = 75;// Масса тела в кг
        double h = 1.85;// Рост в метрах
        int index = service.calculate(m,h);
        System.out.println("Индекс массы тела - " + index);
    }
}