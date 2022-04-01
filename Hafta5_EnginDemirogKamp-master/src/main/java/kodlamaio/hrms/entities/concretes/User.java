package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	
	@Column(name="user_id")
	 int userId;
	
	@Column(name="user_name")
	 String userName;
	



	

}
