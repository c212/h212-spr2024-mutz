public class ScaleableLetters {
  /*
    OOOO
  OO    OO
  OO    OO
  OO    OO
    OOOO
  */
  
  
  public static void main(String[] args) {
    int canvas = 10;
    
    //Draws pattern
    for(int y = 0; y < canvas; y++){
      for(int x = 0; x < canvas; x++){
        if(shouldDraw(x, y, canvas))
          System.out.print("OO");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
    
    //Check if shold draw
  }

  private static boolean shouldDraw(int x, int y, int canvas){
    if(x == 0 && (y > 0 && y < canvas - 1)){
      return true;
    }

    if(x == canvas - 1 && (y > 0 && y < canvas - 1)){
      return true;
    }

    if(y == 0 && x > 0 && x < canvas - 1){
      return true;
    }

    if(y == canvas - 1 && x > 0 && x < canvas - 1){
      return true;
    }

    return false;
  }
}
