package lorryproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lorryproject.entites.ReturnStatus;

public interface ReturnStatusRepo extends JpaRepository<ReturnStatus, Integer>{

}
