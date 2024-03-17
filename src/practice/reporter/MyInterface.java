package practice.reporter;

import practice.camera.FactoryCam;
import practice.camera.SpeedCam;
import practice.detector.AccidentDetector;
import practice.detector.AdvancedFireDetector;
import practice.detector.Detectable;
import practice.detector.FireDetector;

public class MyInterface {
    public static void main(String[] args) {
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        Detectable accidentDetector = new AccidentDetector();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect(); // 일반 성능으로 화재를 감지합니다.
        factoryCam.report(); // 직전 30초 영상과 함께 신고를 진행합니다.

        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(accidentDetector);
        speedCam.setReporter(videoReporter);

        speedCam.detect();
        speedCam.report();
    }
}
