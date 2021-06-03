package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
																	//JobPositions tablosunun pkey alanı yani id inetegr oldugu icin buraya integer verdik
	//boolean existsByJobPositionName(String jobPosition);
}
