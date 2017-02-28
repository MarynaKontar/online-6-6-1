package ua.goit.online6.factory;

/**
 * Created by andreymi on 2/28/2017.
 */
public class FigureFactory {
    private static class Square implements Figure {
        int row;

        Square(int row) {
            this.row = row;
        }

        @Override
        public double square() {
            return row * row;
        }
    }

    private static class Triangle implements Figure {
        int a, b, c;

        public Triangle(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double square() {
            return (a + b + c) * 2;
        }
    }

    private static class Parallelogram implements Figure {
        int a, b;

        public Parallelogram(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public double square() {
            return a * b;
        }
    }

    public static Figure square(int row) {
        return new Square(row);
    }

    public static Figure triangle(int a, int b, int c) {
        return new Triangle(a, b, c);
    }

    public static Figure parallelogram(int a, int b) {
        return new Parallelogram(a, b);
    }
}
