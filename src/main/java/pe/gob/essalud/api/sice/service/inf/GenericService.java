package pe.gob.essalud.api.sice.service.inf;

import java.util.List;
import java.util.Optional;

import pe.gob.essalud.api.sice.service.exception.ServiceException;

public interface GenericService<T> {

	List<T> getAll() throws ServiceException;
	
	List<T> findByLike(T t) throws ServiceException;
	
	Optional<T> findById(T t) throws ServiceException;
	
	T insert(T t) throws ServiceException;
	
	T update(T t) throws ServiceException;
	
	T delete(T t) throws ServiceException;
	
}