// katmanl� mimariler...(veri taban� uygulamalar� i�in kullan�l�r.),(bankac�l�k, e-ticaret gibi uygulamalarda kullan�l�r)
// data access ile veri taban�na eri�im sa�lan�r(DataBase)
// Business
//VI API bu yap�lar veri taban�nda temeli olu�turur...
//IoC ara�t�r...

package northwind;

import northwind.business.abstracts.CategoryService;
import northwind.business.abstracts.EmployeeService;
import northwind.business.abstracts.ProductService;
import northwind.business.concretes.CategoryManager;
import northwind.business.concretes.EmployeeManager;
import northwind.business.concretes.ProductManager;
import northwind.dataAccsess.concretes.CategoryDao;
import northwind.dataAccsess.concretes.EmployeeDao;
import northwind.dataAccsess.concretes.ProductDao;
import northwind.entities.concretes.Category;
import northwind.entities.concretes.Employee;
import northwind.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new ProductDao());
		productService.add(new Product(1, 1, "Elma", 10));
		productService.add(new Product(2, 1, "Armut", -50));
		productService.add(new Product(3, 3, "Karpuz", 8));
		productService.add(new Product(4, 1, "�z�m", 40));
		productService.add(new Product(5, 1, "�eftali", 50));
		productService.add(new Product(5, 5, "�ncir", 50));
		
		
		for (Product product : productService.getAll()) {
			System.out.println(product.getProductName());
		}
		CategoryService categoryService = new CategoryManager(new CategoryDao());
		System.out.println("***************************************");
		categoryService.add(new Category(1,  "Teknoloji"));
		categoryService.add(new Category(2,  "Me�rubat"));
		
		
		for (Category category : categoryService.getAll()) {
			System.out.println(category.getCategoryName());
		}
		EmployeeService employeeService = new EmployeeManager(new EmployeeDao());
		System.out.println("***************************************");
		employeeService.add(new Employee(1,  "Muhammet","Sa�lam","Trabzon"));		
		employeeService.add(new Employee(2,  "Merve","�etin","K�rklareli"));
		employeeService.add(new Employee(2,  "Ayd�n","Da�","Kahramanmara�"));
		employeeService.add(new Employee(2,  "Engin","Demiro�","Ankara/�stanbul"));
		
		for (Employee employee : employeeService.getAll()) {
			System.out.println(employee.getFirstname());
		}
	}

}
