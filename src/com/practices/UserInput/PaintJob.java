package com.practices.UserInput;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width > 0.0 && height > 0.0 && areaPerBucket > 0.0 && extraBucket >= 0) {
            return (int) Math.ceil((width * height / areaPerBucket) - extraBucket);
        }
        return -1;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width > 0.0 && height > 0.0 && areaPerBucket > 0.0) {
            return (int) Math.ceil(width * height / areaPerBucket);
        }
        return -1;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area > 0.0 && areaPerBucket > 0.0) {
            return (int) Math.ceil(area / areaPerBucket);
        }
        return -1;
    }
}
