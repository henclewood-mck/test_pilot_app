package henclewood;

import java.util.List;

/**
 * Hello world!
 */
public final class App {

    public boolean hasCloseElements(List < Double > numbers, double threshold) {
    for (int i = 0; i < numbers.size(); i++) {
      for (int j = i + 1; j < numbers.size(); j++) {
        double distance = numbers.get(i) - numbers.get(j);
        if (distance < threshold) return true;
      }
    }
    return false;
  }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
