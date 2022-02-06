public class BmiService {
    public float calculate(float height, int mass) {
        float bmi = mass / (height * height);
        return bmi;
    }
}
