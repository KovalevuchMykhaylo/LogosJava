package ua.com.hotel.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.hotel.dao.AditionalServiceDao;
import ua.com.hotel.entity.AditionalService;

@Repository
public class AditionalServiceDaoImp implements AditionalServiceDao{
	
	@PersistenceContext(unitName="primary")
	private EntityManager manager;

	@Transactional
	public void save(AditionalService aditionalService) {
		manager.persist(aditionalService);
		
	}

	@Transactional
	public List<AditionalService> findAll() {
		return manager.createQuery("from AditionalService").getResultList();
	}

	@Transactional
	public AditionalService findOne(int id) {
		return manager.find(AditionalService.class, id);
	}

	@Transactional
	public void delete(int id) {
		manager.remove(id);
	}
	

}
