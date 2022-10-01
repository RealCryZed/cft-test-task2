package techshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import techshop.Model.Product;
import techshop.Service.ProductService;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/all/{type}")
    public List<Product> getAllProductsByType(@PathVariable String type) {
        return productService.getAllProductsByType(type);
    }

    @GetMapping("/product/{id}")
    public List<Product> getProductBySerialNumber(@PathVariable Integer serialNumber) {
        return productService.getProductBySerialNumber(serialNumber);
    }
}
