package genericitytest;

public class Point<T> {
    T x;
    T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public static void main(String[] args) {
        // 定义泛型类Gen的一个Integer版本
        Point<Integer> point1 = new Point<Integer>(4, 2);
        point1.setX(7);
        System.out.println("point1= " + point1.getX());
        Point<Double> point2 = new Point<Double>(1.3, 2.6);
        point2.setX(109.91);
        System.out.println("point2= " + point2.getX());
    }

}
