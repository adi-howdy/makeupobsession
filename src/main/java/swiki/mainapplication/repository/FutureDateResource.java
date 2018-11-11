package swiki.mainapplication.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import swiki.mainapplication.model.FutureDate;
import swiki.mainapplication.model.Scheduler;
import swiki.mainapplication.service.FutureDateService;
import swiki.mainapplication.service.SchedulerService;

@Controller
public class FutureDateResource {

	private FutureDateService futureDateService;
	
	@Autowired
	public FutureDateResource(FutureDateService futureDateService) {
		super();
		this.futureDateService = futureDateService;
	}

	/*
	@RequestMapping(value="/scheduler", method = RequestMethod.GET)
	public String showSchedulerForm(ModelMap model, Scheduler scheduler){
		Scheduler scheduler1 = new Scheduler();
		model.addAttribute("scheduler", scheduler1);
		return "scheduler";
	}
	*/
	
	@RequestMapping(value="/index.html", method=RequestMethod.POST)
	public String processScheduler(FutureDate message){
		//System.out.print("scheuler stufff " + scheduler.getLocation() + "\n");
		futureDateService.saveMessage(message);
		
		//System.out.print("scheuler stufff " + scheduler.getShift() + "\n");
		return "redirect:/index.html";
	}
	
	@RequestMapping(value="/index.html", method = RequestMethod.GET)
	public ModelAndView getAll(){
		List<FutureDate> list = futureDateService.findAll();
		return new ModelAndView("index.html", "list", list);
	}
}
