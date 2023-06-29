package ravin.modelos;


public class Cliente extends Pessoa {
	private String alergias;
	private boolean vip;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String alergias, boolean vip) {
		super();
		this.alergias = alergias;
		this.vip = vip;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "Cliente [alergias=" + alergias + ", vip=" + vip + " id " + super.getId() + "]";
	}

	
	
	
}
