package techshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import techshop.Model.Product;
import techshop.Service.ProductService;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    @ResponseBody
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/all/{type}")
    @ResponseBody
    public List<Product> getAllProductsByType(@PathVariable String type) {
        return productService.getAllProductsByType(type);
    }

    @GetMapping("/product/{serialNumber}")
    @ResponseBody
    public List<Product> getProductBySerialNumber(@PathVariable Integer serialNumber) {
        return productService.getProductsBySerialNumber(serialNumber);
    }

    @PostMapping("/edit")
    @ResponseBody
    public Product editProduct(@RequestBody Product product) {
        Product tempProduct = productService.getProductById(product.getProduct_id());
        tempProduct.setTypeOfProduct(product.getTypeOfProduct());
        tempProduct.setSerialNumber(product.getSerialNumber());
        tempProduct.setPrice(product.getPrice());
        tempProduct.setManufacturer(product.getManufacturer());
        tempProduct.setInStock(product.getInStock());
        tempProduct.setAdditionalInfo(product.getAdditionalInfo());
        return productService.saveProduct(tempProduct);
    }

    @PostMapping("/delete/{serialNumber}")
    @ResponseBody
    public void deleteProduct(@PathVariable Integer serialNumber) {
        Product product = productService.getProductBySerialNumber(serialNumber);
        productService.deleteProduct(product);
    }
}
