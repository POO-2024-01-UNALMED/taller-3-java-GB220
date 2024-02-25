package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV = 0;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
	}
	
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setCanal (int canal) {
		this.canal = canal;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen (int volumen) {
		this.volumen = volumen;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setControl (Control control) {
		this.control = control;
	}
	
	public Control getControl() {
		return control;
	}
	
	public static void setnumTV (int numTV) {
		TV.numTV = numTV;
	}
	
	public int getnumTV() {
		return numTV;
	}
	
	public void turnOn () {
		this.estado = true;
	}
	
	public void turnOff () {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp () {
		if (canal > 0 && canal <= 120 && estado == true) {
			this.canal = canal ++;
		}
	}
	
	public void canalDown () {
		if (canal > 0 && canal <= 120 && estado == true) {
			this.canal = canal --;	
		}
	}
	
	public void volumenUp () {
		if (volumen > 0 && volumen <=7 && estado == true) {
			this.volumen = volumen ++;
		}
	}
	
	public void volumenDown () {
		if (volumen > 0 && volumen <=7 && estado == true) {
			this.volumen = volumen ++;
		}
	}
}