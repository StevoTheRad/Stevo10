public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int m = 75;
        double h = 1.85;
        int index = service.calculate(m,h);
        System.out.println("Индекс массы тела - " + index);
    }

}