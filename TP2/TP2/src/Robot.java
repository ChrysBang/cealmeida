public class Robot {
    private String turnLeft;
    private String direction;
    private String turnRight;
    private String location;
    private String move;

    public static final String Left= "E";
    public static final String Right= "W";
    public static final String Forward= "N";
    public static final String Back= "S";

    public void turnLeft(){
        if(turnLeft=="E");
        turnLeft("E");
    }
    public void turnRight(){
        if(turnRight=="W");
        turnRight("W");
    }
    public void move(){
        if(String=="E" && String=="W" && String=="N" && String=="S")
            return String++;
    }
    public String getLocation(){
        return location;

    }
    public String getDirection(){
        if(turnLeft=="E")
            this.turn(-90);
        else(turnRight=="W")
            this.turn(90);
        else (Forward==N);
            this.turn(180);
        else
            this.turn(-180);
        return direction;
    }
}
