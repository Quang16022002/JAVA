public class Point {

    private int x;
    private int y;
    public static Point origin = new Point();//Khai báo biến static originbiểu diễn gốc tọa độ (0, 0).

    public Point(int x, int y) {//khoi tao Point co toa do xy
        this.x = x;
        this.y = y;
    }

    public Point() {//khoi tao voi toa so 0;0
        this.x = 0;
        this.y = 0;
    }

    public Point(Point p) {//viet ra thui hem hieu co giong y cua de bai khong
        this.x = p.x;
        this.y = p.y;
    }
//tao Set va get cho x va y

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
//Override các phương thức sau của lớp Object
    @Override
    public boolean equals(Object obj) {//ham khong lam viec
        Point a = new Point(x, y);
        if (obj.equals(a)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "(+" + this.x + "," + this.y + ")";

    }
//boolean isOrigin(): kiểm tra xem điểm có phải là gốc tọa độ (0, 0).
    public boolean isOrigin() {
        Point a = new Point(this.x, this.y);
        if (a == origin) {
            return true;
        } else {
            return false;
        }

    }


//static double distance(Point p1, Point p2): tính khoảng cách giữa
//điểm p1và p2.
    public static double distance(Point p1, Point p2) {
        double kc;
        kc = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        return kc;
    }

    }


