package lorryproject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lorryproject.entites.LorryInformation;
import lorryproject.repo.LorryInformationRepo;

@RestController
public class LorryInformationController {

	@Autowired
	private LorryInformationRepo repo;

	
	@GetMapping("/totallorries")
	public List<LorryInformation> get(){
		
		return repo.findAll();
	}
	@GetMapping("/to")
	public List<LorryInformation> get6(){
		return repo.findAll();
	}
	
}
