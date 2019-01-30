package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    private String name;

    public Item() {
    }

    public Item(Long id, String name, Double price) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    }

    public Long getId() {
        return null;
    }

    public void setId(Long id) {
    }

    public Double getPrice() {
        return null;
    }

    public void setPrice(Double price) {
    }
}
