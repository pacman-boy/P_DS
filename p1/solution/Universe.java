import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Universe {
  private int numBodies;
  private double radius;
  private Body[] bodies;

  public Universe(Body[] bodies, double radius) {
    this.bodies = bodies;
    this.numBodies = bodies.length;
    this.radius = radius;
  }


  void update(double dt) {
    // initialize the forces to zero
    Vector[] f = new Vector[numBodies];
    for (int i = 0; i < numBodies; i++) {
      f[i] = new Vector(new double[2]);
    }
// compute the forces
    for (int i = 0; i < numBodies; i++) {
      for (int j = 0; j < numBodies; j++) {
        if (i != j) {
          f[i] = f[i].plus(bodies[i]
              .forceFrom(bodies[j]));
        }
      }
    }
// move the bodies
    for (int i = 0; i < numBodies; i++) {
      bodies[i].move(f[i], dt);
    }
  }

  public double getRadius() {
    return radius;
  }

  public Vector getBodyPosition(int i) {
    return bodies[i].getPosition();
  }

  public int getNumBodies() {
    return numBodies;
  }
}

