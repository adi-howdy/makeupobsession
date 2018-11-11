package swiki.mainapplication.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swiki.mainapplication.model.Customer;
import swiki.mainapplication.model.Scheduler;
import swiki.mainapplication.repository.SchedulerRepository;



@Service("schedulerService")
public class SchedulerService {
	
	@Autowired
	private SchedulerRepository schedulerRepository;
	
	public Scheduler saveScheduler(Scheduler scheduler){
		return schedulerRepository.save(scheduler);
	}
	
	public List<String> findShiftAll(){
		return schedulerRepository.findShift();
	}
	
	public List<Date> findDateAll(){
		return schedulerRepository.findDate();
	}
	
	public List<Scheduler> findAll(){
		return schedulerRepository.findAll();
	}
	
	
	
}