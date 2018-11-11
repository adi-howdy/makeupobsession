package swiki.mainapplication.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="customer")
public class Customer {

	private int id;
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="age")
	private int age;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="prev_participation")
	private String prev_participation;
	
	/*
	@Column(name="location")
	private  String prev_makeUp_location;
	
	@Column(name="period")
	private String prev_makeUp_period;
	*/
	@Column(name="interest")
	private String interest;
	
	
	@Column(name="skin_type")
	private String skin_type;
	
	
	@Column(name="makeup_use")
	private String makeup_use;
	
	@Column(name="registered_date")
	private Date registered_date;
	
	@Column(name="allergies")
	private String allergies;
	
	/*
	@Column(name="allergic")
	private String allergic;
	*/
	public String getMakeup_use() {
		return makeup_use;
	}

	public void setMakeup_use(String makeup_use) {
		this.makeup_use = makeup_use;
	}
/*
	public String getAllergic() {
		return allergic;
	}

	public void setAllergic(String allergic) {
		this.allergic = allergic;
	}
*/
	private String shift;
	//private Set<Book> book;
	
	public Customer(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	

	public String getPrev_participation() {
		return prev_participation;
	}

	public void setPrev_participation(String prev_participation) {
		this.prev_participation = prev_participation;
	}
	
	
	public Date getRegistered_date() {
		return registered_date;
	}

	public void setRegistered_date(Date registered_date) {
		this.registered_date = registered_date;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	/*
	public String getPrev_makeUp_location() {
		return prev_makeUp_location;
	}

	public void setPrev_makeUp_location(String prev_makeUp_location) {
		this.prev_makeUp_location = prev_makeUp_location;
	}

	public String getPrev_makeUp_period() {
		return prev_makeUp_period;
	}

	public void setPrev_makeUp_period(String prev_makeUp_period) {
		this.prev_makeUp_period = prev_makeUp_period;
	}
*/
	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getSkin_type() {
		return skin_type;
	}

	public void setSkin_type(String skin_type) {
		this.skin_type = skin_type;
	}
	
	
/*

	public String getUse_Makeup() {
		return use_Makeup;
	}

	public void setUse_Makeup(String use_Makeup) {
		this.use_Makeup = use_Makeup;
	}

	public String getAllergic() {
		return allergic;
	}

	public void setAllergic(String allergic) {
		this.allergic = allergic;
	}
	
	*/
	/**
	@ManyToMany(mappedBy = "author")
    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
    */
	
	/**
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	*/
}
