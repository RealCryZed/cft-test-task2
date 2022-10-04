package techshop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techshop.Model.Product;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findAllByTypeOfProductIgnoreCase(String type);
    List<Product> findAllBySerialNumber(Integer serialNumber);

    Product findProductBySerialNumber(Integer serialNumber);
}
