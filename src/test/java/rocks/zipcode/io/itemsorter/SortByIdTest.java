package rocks.zipcode.io.itemsorter;

import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByIdTest {
    @Test
    public void test1() {
        Comparator<Item> comparator = (Comparator<Item>) new NameComparator();
    }
}
