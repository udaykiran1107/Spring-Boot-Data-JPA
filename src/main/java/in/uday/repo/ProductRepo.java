package in.uday.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import in.uday.entity.Product;
public interface ProductRepo extends JpaRepository<Product,String> {
	
}
