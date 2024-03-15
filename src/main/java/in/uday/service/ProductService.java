package in.uday.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.uday.entity.Product;
import in.uday.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired	
	private ProductRepo prepo;
	
	public void getdata() {
		Product p= new Product();
		p.setPname("virat");
		p.setPrice(6000.00);
		Product s = prepo.save(p);
		System.out.println(s);
	
	}
}
