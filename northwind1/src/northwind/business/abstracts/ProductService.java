package northwind.business.abstracts;

import java.util.List;

import northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();

	void add(Product prouct);

}
