package change_making;

import java.util.HashMap;
import java.util.Map;

public class CashBag {
  private Map<Double, Integer> cash;
  public CashBag() {
    cash = new HashMap<>();
    cash.put(0.01, 0);
    cash.put(0.02, 0);
    cash.put(0.05, 0);
    cash.put(0.10, 0);
    cash.put(0.20, 0);
    cash.put(0.50, 0);
    cash.put(1.00, 0);
    cash.put(2.00, 0);
    cash.put(5.00, 0);
    cash.put(10.00, 0);
    cash.put(20.00, 0);
    cash.put(50.00, 0);
  }

  public void addCash(double denomination, int count) {
    cash.put(denomination, cash.get(denomination) + count);
  }

  public boolean change(CashBag ClientBag){ // Descontar las monedas de la caja.

  }

  public double total(){
    double sum = 0.0;
    for (Double denomination : cash.keySet()) {
      int count = cash.get(denomination);
      sum += denomination * count;
    }
    return Math.round(sum * 100.0) / 100.0;
  }

  public boolean contains(CashBag bag) {
    for (Double denomination : bag.cash.keySet()) {
      int requiredBag = bag.cash.get(denomination);
      int currentBag = this.cash.getOrDefault(denomination, 0); // Para no devolver null y poder comparar luego

      if (currentBag < requiredBag) {
        return false;
      }
    }
    return true;
  }

  public void mergeBags(CashBag bag){

  }

  public...// print money

  public boolean isEmpty(){
    for (Double denomination : cash.keySet()) {
      if (cash.get(denomination) > 0) {
        return false;
      }
    }
    return true;
  }
}
