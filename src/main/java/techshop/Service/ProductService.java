package techshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techshop.Model.Product;
import techshop.Model.ProductCheck;
import techshop.Repo.ProductRepo;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product saveProduct(Product product) {
        if(checkProduct(product))
            return productRepo.save(product);
        else return null;
    }

    public void deleteProduct(Product product) {
        productRepo.delete(product);
    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public List<Product> getAllProductsByType(String type) {
        return productRepo.findAllByTypeOfProductIgnoreCase(type);
    }

    public Product getProductById(Integer product_id) {
        return productRepo.getById(product_id);
    }

    public Product getProductBySerialNumber(Integer serialNumber) {
        return productRepo.findProductBySerialNumber(serialNumber);
    }

    private boolean checkProduct(Product product) {
        ProductCheck tempProduct = new ProductCheck();
        boolean isValid = false;

        for (String productType : tempProduct.getPRODUCT_TYPES()) {
            if (product.getTypeOfProduct().toLowerCase().equals(productType))
                isValid = true;
        }

        if (product.getTypeOfProduct().toLowerCase().equals("настольный компьютер")) {
            for (String formFactor : tempProduct.getPC_FORM_FACTORS()) {
                if (product.getAdditionalInfo().toLowerCase().equals(formFactor))
                    isValid = true;
            }
        }

        if (product.getTypeOfProduct().toLowerCase().equals("ноутбук")) {
            for (String notebookSize : tempProduct.getNOTEBOOK_SIZES()) {
                if (product.getAdditionalInfo().toLowerCase().equals(notebookSize))
                    isValid = true;
            }
        }
        return isValid;
    }
}
