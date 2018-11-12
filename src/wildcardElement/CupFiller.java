package wildcardElement;

import java.util.*;

class CupFiller {

    // metoda przyjmuje tylko klasy pochodne od Shape
    public static void drawShapes(List<? extends Shape> list) {
        for (Shape s : list) {
            s.draw();
        }
    }

    public static void main(String args[]) {
        List<Traingle> triangleList = new ArrayList<>();
        triangleList.add(new Traingle());

        List<Square> squareList = new ArrayList<>();
        squareList.add(new Square());
        squareList.add(new Square());

        drawShapes(triangleList);
        drawShapes(squareList);
    }
}
