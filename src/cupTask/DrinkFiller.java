package cupTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinkFiller {
    public static void main(String[] args) {
        Cup<Tea> cupOfTea = new Cup<>(new Tea());
        Cup<OrangeJuice> cupOfOrangeJuice = new Cup<>(new OrangeJuice());
        List<Cup> cups = Arrays.asList(cupOfTea, cupOfOrangeJuice);
        for (Cup cup: cups) {
            cup.getDrink().fill();
        }
    }
}
