package myretail.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myretail.domain.Product;
import myretail.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/")
	public List<Product> getProducts() {
		return productService.findAll();
	}
	
	@RequestMapping(value = "/{id}")
	public Product getProduct(@PathVariable Long id) {
		Product product = productService.findOne(id);
		return product;
	}
	
	@RequestMapping(value = "/search/category/{category}")
	public List<Product> getProductsByCategory(@PathVariable String category) {
		List<Product> products = productService.findByCategory(category);
		return products;
	}

}
