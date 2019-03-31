import java.util.Scanner;

public class Triangulo implements figura {
	
	public int lado;
	public String tipo;
	public char caracter;
	
	
	public Triangulo(int lado, String tipo, char caracter) {
		super();
		this.lado = lado;
		this.tipo = tipo;
		this.caracter = caracter;
	}
	
	public Triangulo() {
		super();
		this.lado = 0;
		this.tipo = "";
		this.caracter = '*';
	}

	@Override
	public String nombre() {
		
		
		
		return "Triangulo";
	}

	@Override
	public void dibujar() {
Scanner sc = new Scanner(System.in);
		
		;
		int num = lado;
		
		
		int angulo = Integer.parseInt(tipo);
		int cont = num;
		
		if(angulo == 1) {
			for(int n= 1; n <= num; n++) {
				for(int veces = n; veces !=num;veces++) {
					System.out.print(caracter+" ");
				}System.out.println(caracter);}	
			
		}
		else if(angulo == 2) {
			for(int n= 1; n <= num; n++) {
				for(int veces = 1; veces <= num;veces++) {
					if (veces > 0 + (n-1)){
						System.out.print(caracter+" ");
					}else {
					System.out.print("  ");}
				}System.out.println();}	
					
		}
		else if ( angulo == 3) {
			for(int n= 1; n <= num; n++) {
				for(int veces = 1; veces !=n;veces++) {
					System.out.print(caracter+ " ");
				}System.out.println(caracter);}	}
		
					
		else if(angulo == 4) {
			for(int n= 1; n <= num; n++) {
				for(int veces = 1; veces <= num;veces++) {
					if (veces < num - (n-1)){
						System.out.print("  ");
					}else {
					System.out.print(caracter+" ");}
				}System.out.println();	}}	
		System.out.println();
		
	}

	@Override
	public int area() {
		
		int areatri = this.lado*this.lado/2;
		
		return areatri;
	}

	@Override
	public void setCaracter(char c) {
		this.caracter= c;
		
	}

	@Override
	public char getCaracter() {
		
		return this.caracter;
	}

	@Override
	public String toString() {
		return "Triangulo [lado=" + lado + ", tipo=" + tipo + ", caracter=" + caracter + "]";
	}
	
	
	
	
	
	

}
