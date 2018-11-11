package swiki.mainapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swiki.mainapplication.model.FutureDate;
import swiki.mainapplication.repository.FutureDateRepository;



@Service("futureDateService")
public class FutureDateService {

	@Autowired
	private FutureDateRepository futureDateRepository;
	
	public FutureDate saveMessage(FutureDate message){
		return futureDateRepository.save(message);
	}
	
	public List<FutureDate> findAll(){
		return futureDateRepository.findAll();
	}
}
