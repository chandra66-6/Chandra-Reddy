package techievishnu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import techievishnu.model.VardhanEntity;

@Repository
public interface VardhanRepository extends JpaRepository<VardhanEntity,Integer> {

	VardhanEntity findByName(String name);

	
}
