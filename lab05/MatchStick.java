public class MatchStick {
  public static int length = 1;
  public double yPos;
  public double angle;

  public MatchStick(double _yPos, double _angle){
    yPos = _yPos;
    angle = _angle;
  }

  public double yHigh(){
    return yPos + length * Math.sin(angle);
  }
}
