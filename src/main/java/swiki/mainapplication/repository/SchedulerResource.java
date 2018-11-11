package swiki.mainapplication.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import swiki.mainapplication.model.Customer;
import swiki.mainapplication.model.Scheduler;
import swiki.mainapplication.service.SchedulerService;


@Controller
public class SchedulerResource {
	
	private SchedulerService schedulerService;

	@Autowired
	public SchedulerResource(SchedulerService schedulerService) {
		super();
		this.schedulerService = schedulerService;
	}

	@RequestMapping(value="/scheduler", method = RequestMethod.GET)
	public String showSchedulerForm(ModelMap model, Scheduler scheduler){
		Scheduler scheduler1 = new Scheduler();
		model.addAttribute("scheduler", scheduler1);
		return "scheduler";
	}
	
	@RequestMapping(value="/scheduler", method=RequestMethod.POST)
	public String processScheduler(Scheduler scheduler){
		System.out.print("scheuler stufff " + scheduler.getLocation() + "\n");
		schedulerService.saveScheduler(scheduler);
		
		System.out.print("scheuler stufff " + scheduler.getShift() + "\n");
		return "redirect:/scheduler";
	}
	
	@RequestMapping(value="/allScheduler.html", method = RequestMethod.GET)
	public ModelAndView getAll(){
		List<Scheduler> list = schedulerService.findAll();
		return new ModelAndView("allScheduler.html", "list", list);
	}
	
	
	
	
	
}