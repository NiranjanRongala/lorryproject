package lorryproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lorryproject.entites.LorryInformation;

public interface LorryInformationRepo  extends JpaRepository<LorryInformation, String>{

}
