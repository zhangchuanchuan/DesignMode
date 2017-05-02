public class Main {
  public static void main(String[] args) {
    Player taro = new Player("Taro", new WinningStrategy(System.currentTimeMillis()));
    Player hana = new Player("Hana", new ProbStrategy(System.currentTimeMillis()));
    for (int i=0; i < 10000; i++) {
      Hand taroHand = taro.nextHand();
      Hand hanaHand = hana.nextHand();
      if (taroHand.isStrongerThan(hanaHand)) {
        System.out.println("Winner:" + taro);
        taro.win();
        hana.lose();
      } else if (hanaHand.isStrongerThan(taroHand)) {
        System.out.println("Winner:" + hana);
        taro.lose();
        hana.win();
      } else {
        System.out.println("Even...");
        taro.even();
        hana.even();
      }
    }
    System.out.println("Total result:");
    System.out.println(taro.toString());
    System.out.println(hana.toString());
  }
}
