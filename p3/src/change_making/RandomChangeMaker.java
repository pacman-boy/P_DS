package change_making;

public class RandomChangeMaker extends ChangeMaker{

  @Override
  public CashBag change(Double change) {
    double remaining = change;
    CashBag cash = new CashBag();
    while (remaining > 0) {
      int n = (int) (Math.random() * (denominations.length)); // Crear un int random
      if (denominations[n] <= remaining) {
        remaining = Math.round((remaining - denominations[n]) * 100.0) / 100.0;
        cash.addCash(denominations[n], 1);
      }
    }
    return cash;
  }
}
