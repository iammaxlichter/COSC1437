package CHAPTER4;

class Circle {

    private double radius;
    private double area;
    private double diameter;

    Circle() {
        this.radius = 1;
        this.area = Math.PI * radius * radius;
        this.diameter = radius * 2;
    }

    public void setRadius(double r) {
        this.radius = r;
        this.diameter = radius * 2;
        this.area = Math.PI * (radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }
    
    public double getArea() {
        return area;
    }
}

