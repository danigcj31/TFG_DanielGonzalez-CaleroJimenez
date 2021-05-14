package backend.dominio;

public class User {
	protected String username;
	protected String email;
	protected String password1;
	protected String password2;
	protected String name;
	protected String apellidos;
	protected String imagen;
	
	public User(String username, String email, String password1, String password2, String name, String apellidos, String imagen) {
		super();
		this.username = username;
		this.email = email;
		this.password1 = password1;
		this.password2 = password2;
		this.name = name;
		this.apellidos = apellidos;
		this.imagen=imagen;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}
