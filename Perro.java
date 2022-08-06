public class Perro{
    //atributos
    private String comportamiento;
    private float estadoAnimo;
    private float umbralNegativo;
    private String nombre;
     
    //métodos
      public Perro() {
        comportamiento = "";
        estadoAnimo = 0;
        umbralNegativo = 0;
        nombre = "";
    }

	public String getComportamiento() {
		return this.comportamiento;
	}

	public void setComportamiento(String comportamiento) {
		this.comportamiento = comportamiento;
	}

	public float getEstadoAnimo() {
		return this.estadoAnimo;
	}

	public void setEstadoAnimo(float estadoAnimo) {
		this.estadoAnimo = estadoAnimo;
	}

	public float getUmbralNegativo() {
		return this.umbralNegativo;
	}

	public void setUmbralNegativo(float umbralNegativo) {
		this.umbralNegativo = umbralNegativo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

  
}
