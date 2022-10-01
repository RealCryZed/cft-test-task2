package techshop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    private String typeOfProduct;

    private Integer serialNumber;
    private String manufacturer;
    private Integer price;
    private Integer inStock;

    private String additionalInfo;
}
