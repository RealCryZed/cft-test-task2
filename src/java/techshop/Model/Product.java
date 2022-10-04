package techshop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer product_id;

    private String typeOfProduct;

    @Column(unique = true)
    private Integer serialNumber;
    private String manufacturer;
    private Integer price;
    private Integer inStock;

    private String additionalInfo;
}
