package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    //properties
    private Long id = 0L;              //YOU CAN EITHER DO THIS AFTER YOU GET NULL AS ONE OF YOUR FAILED TESTS
    private String name = "";
    private Double price = 0.01;

    // default constructor
    /**test that failed:
     * public void testNullaryConstructor() {
     *         // given
     *         String expectedName = "";
     *         Long expectedId = 0L;
     *         Double expectedPrice = 0.01;
     *
     *         // when
     *         Item item = new Item();
     *         Long actualId = item.getId();
     *         String actualName = item.getName();
     *         Double actualPrice = item.getPrice();
     *
     *         // then
     *         Assert.assertEquals(expectedId, actualId);
     *         Assert.assertEquals(expectedName, actualName);
     *         Assert.assertEquals(expectedPrice, actualPrice);
     *     }
     */
    public Item() {            //OR YOU CAN PUT IT INSIDE OF YOUR CONSTRUCTOR!!!!!!
        this.name = "";
        this.id = 0L;
        this.price = 0.01;

    }

    //real constructor
    public Item(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
