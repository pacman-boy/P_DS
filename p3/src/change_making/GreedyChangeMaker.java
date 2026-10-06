package change_making;

public class GreedyChangeMaker extends ChangeMaker{

  @Override
  public CashBag change(Double change) {
    double remaining = Math.round(change * 100.0) / 100.0; // Necesario para que con double de el cambio correcto.
    CashBag bag = new CashBag();
    for (Double denom : denominations) {
      int i = 0;
      while (true) {
        if (denom <= remaining) {
          i++;
          remaining = Math.round((remaining - denom) * 100.0) / 100.0;
        } else {
          if (i > 0) {
            bag.addCash(denom, i);
          }
          break;
        }
      }
    }
    return bag;
  }
}
