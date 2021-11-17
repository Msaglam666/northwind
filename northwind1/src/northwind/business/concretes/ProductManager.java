package northwind.business.concretes;

import java.util.List;

import northwind.business.abstracts.ProductService;
import northwind.dataAccsess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAll() {

		return this.productRepository.getAll();
	}

	@Override
	public void add(Product product) {
		if(checkProductPrice(product.getUnitPrice())) {
            if(checkcategoryId(product)) {
                this.productRepository.add(product);
            }
            else {
                System.out.println("3 numaralý kategori fiyatý 10 da büyük olmalýdýr.");
            }
            var result = checkProductNameExists(product.getProductName());
    		
    		if(result!=false) {
    			productRepository.add(product);
    		}
            if(checkProductCountOfCategory(product)) {
            	this.productRepository.add(product);
            }
            else {
            	System.out.println("Ayný kategoride 5 den fazla ürün olamaz!");
            }          
        }
		
        else {
        System.out.println("Ürün fiyatý - olamaz");}
		
		}

	private boolean checkProductPrice(double unitPrice) {
		if (unitPrice < 0) {
			return false;
		}
		return true;
	}

	private boolean checkcategoryId(Product product) {
		if (product.getCategoryId() == 3 && product.getUnitPrice() < 10) {
			return false;
		}
		return true;
	}

	private boolean checkProductCountOfCategory(Product product) {
		var result = productRepository.getAll();
		int count = 0;
		for (Product p : result) {
			if (p.getCategoryId() == product.getCategoryId()) {
				count++;
			}
		}
		if (count > 5) {
			return false;
		}
		return true;

	}

	private boolean checkProductNameExists(String productName) {
		var result = productRepository.getAll();
		for (Product product : result) {
			if (product.getProductName() == productName) {
				System.out.println("Ayný isimde ürün eklenemez!");
				return false;
			}

		}
		return true;
	}

}
