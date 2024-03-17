package practice.camera;
public class MyAbstractClass {
    // 데이터 추상화 (Data abstraction)
    // abstact
    // 추상 클래스 (아직 완성되지 않은 클래스)
    // 추상 메소그 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)

    public static void main(String[] args) {
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
