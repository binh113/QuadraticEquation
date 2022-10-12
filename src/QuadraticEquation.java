public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDelta() {
        return Math.pow(this.getB(), 2) - (4 * this.getA() * this.getC());
    }

    public double getRoot1() {
        return (-this.getB() + Math.pow(Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC(), 0.5)) / (2 * this.getA());
    }

    public double getRoot2() {
        return (-this.getB() - Math.pow(Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC(), 0.5)) / (2 * this.getA());
    }
}
