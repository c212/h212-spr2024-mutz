public class Zombie {
    public enum Direction {North, East, South, West};
    private int x, y;

    public Zombie(){
        x = 0;
        y = 0;
    }

    public void move(Direction d){
        switch (d) {
            case North -> x++;
            case East -> y++;
            case West -> y--;
            case South -> x--;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
