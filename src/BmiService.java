public class BmiService {
    public int calculate(double heightMeters, double weightKilograms) {
        double bmi = weightKilograms / (heightMeters * heightMeters);
        return (int) bmi;
    }
}
