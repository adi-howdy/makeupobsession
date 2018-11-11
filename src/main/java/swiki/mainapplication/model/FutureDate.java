package swiki.mainapplication.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="future")
public class FutureDate {

	
	
	public FutureDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String message;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
