
public class rectangulo implements figura {
	
	public int base;
	public int altura;
	public char caracter;
	
	
	
	
	public rectangulo(int base, int altura, char caracter) {
		super();
		this.base = base;
		this.altura = altura;
		this.caracter = caracter;
	}
	
	public rectangulo() {
		super();
		this.base = 0;
		this.altura = 0;
		this.caracter = '*';
	}
	
	@Override
	public String nombre() {
		
		return "rectangulo";
	}
	@Override
	public void dibujar() {
		
		for(int x = 0 ; x<altura;x++) {
			for(int i = 0 ;i<base; i++) {
				System.out.print(caracter+" ");
			}System.out.println();
		}
		
		System.out.println();
		
		
	}
	@Override
	public int area() {
		
		int areaua = this.base*this.altura;
		
		return areaua;
	}
	@Override
	public void setCaracter(char c) {
		
		this.caracter=c;}

	@Override
	public char getCaracter() {
		// TODO Apéndice de método generado automáticamente
		return this.caracter;
	}

	@Override
	public String toString() {
		return "rectangulo [base=" + base + ", altura=" + altura + ", caracter=" + caracter + "]";
	}
		
		
	}


	
	
	
	
	


