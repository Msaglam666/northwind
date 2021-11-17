package northwind.dataAccsess.abstracts;

import java.util.List;

public interface DaoRepository<T> {
	void add(T category);

	void delete(T category);

	void update(T category);

	T getById(int id);

	List<T> getAll();
}
