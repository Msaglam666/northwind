// veri taban�na eri�mek i�in yap�lan �al��malar� koydu�umuz s�n�fa repository denir...
//ISP interface seggregetion 
package northwind.dataAccsess.abstracts;

import northwind.entities.concretes.Product;

public interface ProductRepository extends DaoRepository<Product> {

}
