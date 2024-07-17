package fan;

public class main {
    public static void main(String[] args) {
        Fan fan1 = new Fan("yellow",10,true,Fan.SLOW);
        Fan fan2 = new Fan("blue",5,false,Fan.FAST);
        System.out.println(fan1.toString());
        fan1.setOn(true);
        System.out.println(fan1.toString());
    }
}
