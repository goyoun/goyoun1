package member;

public class memberDTO {
	
	
	int memberNumber;
	String id;
	String password;
	String name;
	String email;	
	
	memberDTO () {
		
	}
	

	public memberDTO(int memberNumber, String id, String password, String name, String email) {
		super();
		this.memberNumber = memberNumber;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
	}


	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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


	@Override
	public String toString() {
		return "memberDTO [memberNumber=" + memberNumber + ", id=" + id + ", password=" + password + ", name=" + name
				+ ", email=" + email + "]";
	}
	
}

