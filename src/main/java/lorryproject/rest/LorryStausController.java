package lorryproject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lorryproject.entites.LorryStatus;
import lorryproject.repo.LorryStatusRepo;
@RestController
public class LorryStausController {

	@Autowired
	private LorryStatusRepo lorryStausRepo;
	
	@GetMapping("/status")
	public List<LorryStatus> get1(){
		return lorryStausRepo.findAll();
		
	}
//	@GetMapping("/total")
//	public List<LorryStatus> get(){
//		return LorryStatusRepo.findAll();
//	}
}
