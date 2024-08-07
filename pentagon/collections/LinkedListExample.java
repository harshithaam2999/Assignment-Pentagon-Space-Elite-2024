package pentagon.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample{
    public static void main(String[] args) 
    {
        Watches w1 = new Watches("NoiseFit", "Android", 3000, "Men");
        Watches w2 = new Watches("Rolex", "Analog", 200000, "Men");
        Watches w3 = new Watches("Apple", "iWatch", 80000, "Women");
        Watches w4 = new Watches("Titan", "Digital", 3000, "Women");
        Watches w5 = new Watches("Sonata", "Analog", 50000, "Men");

        LinkedList<Watches> watchList = new LinkedList<>();
        Collections.addAll(watchList, w1, w2, w3, w4, w5);

        LinkedList<Watches> menWatches = new LinkedList<>();
        LinkedList<Watches> womenWatches = new LinkedList<>();

        for (Watches watch : watchList)
        {
            if (watch.getGender().equals("Men"))
            {
                menWatches.add(watch);
            }
            else if (watch.getGender().equals("Women"))
            {
                womenWatches.add(watch);
            }
        }

        System.out.println("Men's Watches: " + menWatches);
        System.out.println("Women's Watches: " + womenWatches);
    }
}
