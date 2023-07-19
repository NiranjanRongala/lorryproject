package lorryproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lorryproject.entites.LorryStatus;

public interface LorryStatusRepo  extends JpaRepository<LorryStatus, Integer>{

	

}
