public class NBodySimulator {
  private Universe universe;
  private double timeStep;
  private int pauseTime;
  private boolean trace;

  private void createCanvas() {
//StdDraw.setCanvasSize(700, 700); // uncomment for a larger window
    StdDraw.enableDoubleBuffering();
    StdDraw.setPenRadius(0.025);
    double radius = universe.getRadius();
// read from txt file, second line
    StdDraw.setXscale(-radius, +radius);
    StdDraw.setYscale(-radius, +radius);
  }

  public void simulate() {

  }

  private void drawUniverse(){
  }

  public NBodySimulator(Universe universe, double dt, int pt, boolean doTrace) {
    this.universe = universe;
    timeStep = dt;
    pauseTime = pt;
    trace = doTrace;
  }

}
