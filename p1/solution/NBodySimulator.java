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

    if (trace) {
      StdDraw.clear(StdDraw.GRAY);
    }
  }

  public void simulate() {
    createCanvas();
    while (true) {
      if (trace){
        StdDraw.setPenColor(StdDraw.WHITE);
        drawUniverse();
        universe.update(timeStep);
        StdDraw.setPenColor(StdDraw.BLACK);
        drawUniverse();
      } else {
        StdDraw.clear();
        universe.update(timeStep); // update bodies
        drawUniverse(); // tell each body to draw itself

      }
      StdDraw.show();
      StdDraw.pause(pauseTime);
    }
  }

  private void drawUniverse(){
    int num = universe.getNumBodies();
    for (int i = 0; i < num; i++) {
      Vector position = universe.getBodyPosition(i);
      StdDraw.point(position.cartesian(0),position.cartesian(1));
    }
  }

  public NBodySimulator(Universe universe, double dt, int pt, boolean doTrace) {
    this.universe = universe;
    timeStep = dt;
    pauseTime = pt;
    trace = doTrace;
  }

}
