package pentagon.collections;

import java.util.ArrayList;
import java.util.Collections;

public class DrinkTest {
    public static void main(String args[]) {
        Drinks d1 = new Drinks("SoftDrinks", "Cococola", 2, 120);
        Drinks d2 = new Drinks("HotDrinks", "Black&White", 0.75, 2400);
        Drinks d3 = new Drinks("SoftDrinks", "Slice", 650, 50);
        Drinks d4 = new Drinks("Beer", "Toorg", 650, 190);
        Drinks d5 = new Drinks("Vodka", "Magic Moment Green Apple", 750, 1600);

        ArrayList<Drinks> drinksList = new ArrayList<>();

        Collections.addAll(drinksList, d1, d2, d3, d4, d5);

        for (Drinks d : drinksList) {
            System.out.println(d);
            System.out.println("*******************");
        }

        drinksList.remove(3); // removing from the index
        System.out.println();
        System.out.println("After Removal");
        System.out.println("*******************");

        for (Drinks d : drinksList) {
            System.out.println(d);
            System.out.println("************************");
        }

        drinksList.set(3, d5);
        System.out.println();
        System.out.println("After Update");
        System.out.println("*******************************");

        for (Drinks d : drinksList) {
            System.out.println(d);
            System.out.println("**************************");
        }

        Drinks updatedDrink = drinksList.get(3);
        System.out.println();
        System.out.println("After update");
        System.out.println("******************************");

        for (Drinks d : drinksList) {
            System.out.println(d);
            System.out.println("**************************");
        }
    }
}