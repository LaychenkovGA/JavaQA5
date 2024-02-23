public class BmiService {
    public int calculate(int kg, double m) {
        int bmi;
        bmi = (int) (kg / (m * m));
        return bmi;
    }
}