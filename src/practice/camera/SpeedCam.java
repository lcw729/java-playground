package practice.camera;

import practice.detector.Detectable;
import practice.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {

    Detectable detector;
    Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("과속 감");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
