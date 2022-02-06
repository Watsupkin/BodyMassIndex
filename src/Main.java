public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(1.75f, 72);
        System.out.println("Индекс массы тела составляет: " + bmi);
    }
}