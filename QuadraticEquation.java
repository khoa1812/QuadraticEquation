package QuadraticEquation;

import Rectangle.Main;

public class QuadraticEquation {
    int a, b, c;
    double delta;
    double x1, x2;
    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return delta = this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return x1 = ( - this.b + Math.sqrt(delta)) / ( 2 * this.a );
    }
    public double getRoot2() {
        return x2 = ( - this.b - Math.sqrt(delta)) / ( 2 * this.a );
    }
    public String display() {
        return "QuadraticEquation{" + "x1 = " + x1 + ", x2 = " + x2 + "}";
    }
}
