public class Point {
    private int x;
    private int y;

public Point (int x,int y){
    this.x=x;
    this.y=y;
}

public String toString(){
    return "(x =" + x + ", y =" + y + ")";
}
public double length (Point digerPoint){
    double farkX = this.x - digerPoint.x;
    double farkY = this.y - digerPoint.y;


    return Math.sqrt(farkX * farkX +farkY * farkY);
}
}
