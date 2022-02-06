public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.75f;
        int mass = 72;
        float bmi = service.calculate(height, mass);
        System.out.println("Индекс массы тела составляет: " + bmi);
    }
}