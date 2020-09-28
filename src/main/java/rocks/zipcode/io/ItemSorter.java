package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    //properties
    private Item[] items;

//methods
    public ItemSorter(Item[] items) {
        this.items = items;
    }

   public Item[] sort(Comparator<Item> comparator) {
       Collections.sort(Arrays.asList(items), comparator); //
       return items;
    }
}
