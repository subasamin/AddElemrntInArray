package ss6.point;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(1, 2);
        Point3D p3d = new Point3D(3, 4, 5);
        p2d.setXY(4,5);
        p3d.setXYZ(6,7,8);
        System.out.println(Arrays.toString(p2d.getXY()));
        System.out.println(Arrays.toString(p3d.getXYZ()));
    }
}
