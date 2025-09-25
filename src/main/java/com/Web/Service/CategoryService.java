package com.Web.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Web.Entity.Category;
import com.Web.Repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository crurepo;
	
	public Category saveCategory(Category c) {
		return crurepo.save(c);
	}
	public List<Category> getallCategories(){
		return crurepo.findAll();
	}
	public void deleteById(int id) {
		 crurepo.deleteById(id);
	}
	public Optional<Category> fetchById(int id){
		return crurepo.findById(id);
	}

}
