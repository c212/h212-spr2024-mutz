public class BuffoonExperiment {
  static int distance = 2;
  static int totalLength = 100;
  // See if it crosses: y-high = y-low + sinα
  public static void main(String[] args){
    double crossing = 0;
    double tests = 0;
    for(tests = 0; tests < 100000; tests++){
      if(doesCross(generateRandomMatchStick())){
        crossing++;
      }
    }

    System.out.println("The buffoon crossed " + crossing + " times out of " + tests);
    System.out.println("The quotent is roughly " + tests/crossing);
  }

  static MatchStick generateRandomMatchStick(){
    return new MatchStick(Math.random() * totalLength - MatchStick.length, Math.random() * Math.PI);
  }

  static boolean doesCross(MatchStick m){
    for(double i = 0; i < totalLength; i += distance){
      if(m.yPos < i && m.yHigh() > i)
        return true;
    }
    return false;
  }
}
