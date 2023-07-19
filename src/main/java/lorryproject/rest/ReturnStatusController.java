package lorryproject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lorryproject.entites.ReturnStatus;
import lorryproject.repo.ReturnStatusRepo;

@RestController
public class ReturnStatusController {

	@Autowired
	private ReturnStatusRepo repo3;
	
	@GetMapping("/all")
	public List<ReturnStatus> get4(){
		return repo3.findAll();
	}
	}
