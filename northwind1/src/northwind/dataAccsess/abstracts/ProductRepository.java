// veri tabanýna eriþmek için yapýlan çalýþmalarý koyduðumuz sýnýfa repository denir...
//ISP interface seggregetion 
package northwind.dataAccsess.abstracts;

import northwind.entities.concretes.Product;

public interface ProductRepository extends DaoRepository<Product> {

}
