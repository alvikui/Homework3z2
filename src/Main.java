public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.90;
        double weightKilograms = 70;

        int bmi = service.calculate(heightMeters, weightKilograms); // должно получиться 28
        System.out.println("Ваш BMI - индекс массы тела: " + bmi);
    }
}