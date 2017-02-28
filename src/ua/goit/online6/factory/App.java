package ua.goit.online6.factory;

import java.util.Collections;

/**
 * Created by andreymi on 2/28/2017.
 */
public class App {
    public static void main(String[] args) {
        Figure sq = FigureFactory.square(4);
        Figure tr = FigureFactory.triangle(1, 2, 3);
        Figure pal = FigureFactory.parallelogram(3, 4);

        System.out.println(sq.square());
        System.out.println(tr.square());
        System.out.println(pal.square());
    }
}
