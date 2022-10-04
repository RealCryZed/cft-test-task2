package techshop.Repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import techshop.Model.Product;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepoTest {

    @Autowired
    private ProductRepo productRepo;

    @Test
    public void testProductRepo_whenSaveAndFindBySerialNumber_thenOK() {
        Product product = new Product();
        product.setProduct_id(1);
        product.setTypeOfProduct("ноутбук");
        product.setSerialNumber(123);
        product.setPrice(150);
        product.setManufacturer("Apple");
        product.setInStock(10);
        product.setAdditionalInfo("17 дюймов");

        productRepo.save(product);
        Product foundProduct = productRepo.findProductBySerialNumber(product.getSerialNumber());

        assertNotNull(foundProduct);
        assertEquals(product.getManufacturer(), foundProduct.getManufacturer());
        assertEquals(product.getSerialNumber(), foundProduct.getSerialNumber());

        productRepo.deleteById(product.getProduct_id());
    }
}