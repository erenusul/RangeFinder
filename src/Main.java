//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(3,4);
        Point p2 = new Point(6,8);
        double length = p1.length(p2);

        System.out.println("p1 = " + p1.toString());
        System.out.println("p2 = " + p2.toString());
        System.out.println("uzaklık = " + length);
    }

}