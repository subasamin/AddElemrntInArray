package ss6.point;

import java.awt.*;
import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    float [] XYZ = {getX(), getY(), getZ()};
    public float[] getXYZ(){
        return XYZ;
    }

    public void setXYZ(float x, float y, float z){
        XYZ[0] = x;
        XYZ[1] = y;
        XYZ[2] = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", XYZ=" + Arrays.toString(XYZ) +
                '}';
    }
}
