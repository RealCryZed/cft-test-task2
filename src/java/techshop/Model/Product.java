package techshop.Model;

import lombok.Data;

@Data
public abstract class Product {

    private int serialNumber;
    private String manufacturer;
    private int price;
    private int inStock;
}
