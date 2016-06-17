package project.baseuser.table;
import javax.persistence.*;

@Entity
@Table (name="users")
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int user_id;
	
	@Column(name="full_name")
	private String full_name;
	
	@Column(name="department")
	private String department;
	
	@Column(name="post")
	private String post;
	
	@Column(name="ref_head")
	private int ref_head;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public int getRef_head() {
		return ref_head;
	}
	public void setRef_head(int ref_head) {
		this.ref_head = ref_head;
	}
}



