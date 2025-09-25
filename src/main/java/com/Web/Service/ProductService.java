package com.Web.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Web.Entity.Product;
import com.Web.Repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prepo;
	
	public Product saveproduct(Product p) {
		return prepo.save(p);
	}
	public List<Product> getAllproducts(){
		return prepo.findAll();
	}
	public void deleteById(long id) {
		prepo.deleteById(id);
	}
	public Optional<Product> fetchById(long id) {
		return prepo.findById(id);
	}
	public List<Product> getproByCatId(int id) {
		return prepo.findAllByCategory_Id(id);
	}

}
