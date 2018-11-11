package swiki.mainapplication.repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



import swiki.mainapplication.model.Customer;
import swiki.mainapplication.service.CustomerService;
import swiki.mainapplication.service.SchedulerService;

@Controller
public class CustomerResource {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	public CustomerResource(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@Autowired
	private SchedulerService schedulerService;
	/*
	@RequestMapping("/about")
	public String About(){
		return "../public/about";
	}
	
	@RequestMapping("/index")
	public String Index(){
		return "../public/index";
	}
	*/
	@RequestMapping(value="/register.html", method = RequestMethod.GET)
	public String showForm(ModelMap model, Customer customer){
		Customer customer1 = new Customer();
		System.out.println("customer name########### " + customer1.toString() + "/n");
		model.addAttribute("customer", customer1);
		return "register.html";
	}
	/*
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index(){
		System.out.print("2");
		return "redirect:/index";
	}
	*/
	/*Saving to database*/
	@RequestMapping(value = "/register.html", method = RequestMethod.POST)
	public String processRegistration(Customer customer, BindingResult bindingResult, HttpServletRequest request)
	{
		System.out.println("customer values: " +  customer.getName() + "\n");
		
		if(bindingResult.hasErrors()) {
			System.out.println("has errors" + "\n");
			return "register.html";
		}
		
		customer.setRegistered_date(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		customerService.saveCustomer(customer);
		//return "redirect:/registerSuccess.html";
		return "redirect:/registerSuccess.html/"+customer.getId();

	}
	
	@RequestMapping(value = "/registerSuccess.html/{id}", method = RequestMethod.GET)
	public ModelAndView getOne(@PathVariable Integer id){
		System.out.print("Id is " + id + "/n");
		Customer customer = customerService.findOne(id);
		return new ModelAndView("registerSuccess.html","customer", customer);
			
		
	}
	
	@RequestMapping(value="/allCustomer.html", method = RequestMethod.GET)
	public ModelAndView getAll(){
		List<Customer> list = customerService.findAll();
		return new ModelAndView("allCustomer", "list", list);
	}
	
	@ModelAttribute("shift")
	public List<String> shiftInitializer(){
		List<String> shift = new ArrayList<String>();
		List<String> shift123 = schedulerService.findShiftAll();
		for(String str: shift123)
		{
			shift.add(str);
		}
		
		return shift;
	}
	

	@ModelAttribute("date")
	public List<Date> dateInitializer(){
		List<Date> date = new ArrayList<Date>();
		List<Date> date123 = schedulerService.findDateAll();
		for(Date date_value: date123)
		{
			date.add(date_value);
		}
		
		return date;
	}

}
