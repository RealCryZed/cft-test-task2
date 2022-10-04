package techshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techshop.Model.Product;
import techshop.Repo.ProductRepo;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    public void deleteProduct(Product product) {
        productRepo.delete(product);
    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public List<Product> getAllProductsByType(String type) {
        return productRepo.findAllByTypeOfProduct(type);
    }

    public List<Product> getProductsBySerialNumber(Integer serialNumber) {
        return productRepo.findAllBySerialNumber(serialNumber);
    }

    public Product getProductById(Integer product_id) {
        return productRepo.getById(product_id);
    }

    public Product getProductBySerialNumber(Integer serialNumber) {
        return productRepo.findProductBySerialNumber(serialNumber);
    }
}
