package change_making;

import java.util.ArrayDeque;
import java.util.ArrayList;

public abstract class ChangeMaker {
  protected Double[] denominations = {50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

  public abstract CashBag change(Double change);
}
