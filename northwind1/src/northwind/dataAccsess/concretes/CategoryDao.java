package northwind.dataAccsess.concretes;

import java.util.ArrayList;
import java.util.List;

import northwind.dataAccsess.abstracts.CategoryRepository;
import northwind.entities.concretes.Category;

public class CategoryDao implements CategoryRepository {

	List<Category> categorys;

	public CategoryDao() {
		categorys = new ArrayList<Category>();
	}

	@Override
	public void add(Category category) {
		categorys.add(category);

	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAll() {
		return categorys;
	}

}
