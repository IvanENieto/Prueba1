import java.util.ArrayList;
import java.util.Scanner;

public class Pantalla {
	
	ArrayList<rectangulo>rectangulos;
	ArrayList<Triangulo>triangulos;
	
	
	public Pantalla(ArrayList<rectangulo> rectangulos, ArrayList<Triangulo> triangulos) {
		super();
		this.rectangulos =  new ArrayList <rectangulo>();
		this.triangulos = new ArrayList <Triangulo>();
	}
	
	
	public void añade_figura(String x) {
		
		Scanner sc = new Scanner(System.in);		
		
		int elegir = Integer.parseInt(x);
		
		
		
		if(elegir==1) {
		System.out.println("Introduce lado, tipo (1 arriba izq, 2 arriba der, 3 abajo izq y 4 abajo der) y caracter");	
			
			
			Triangulo triangulo1 = new Triangulo(sc.nextInt(),sc.next(),sc.next().charAt(0));
			
			triangulos.add(triangulo1);
		}else if(elegir==2) {
			System.out.println("Introduce base, altura y caracter");
		rectangulo rectangulo1 = new rectangulo(sc.nextInt(),sc.nextInt(),sc.next().charAt(0));
					
		rectangulos.add(rectangulo1);		
				
			}
		}
	
	public void modifica_figura(char c) {
		System.out.println("Introduce el nuevo caracter");
		
		if(rectangulos.size()!=0) {
		
		for(int x = 0;x<rectangulos.size();x++) {
			this.rectangulos.get(x).setCaracter(c);
		}
		}else {
			System.out.println("No hay rectangulos");
		}
		if(triangulos.size()!=0) {
		for(int x = 0;x<triangulos.size();x++) {
			this.triangulos.get(x).setCaracter(c);
		}
		}else {
			System.out.println("No hay triangulos");
		}
	
	}
	public void lista_figuras() {
		if(rectangulos.size()!=0) {
		for(rectangulo elto: rectangulos) {
			System.out.println(elto);
		}
		}else {
			System.out.println("No hay cuadrados");
		}
		if(triangulos.size()!=0) {
			
			for(Triangulo elto: triangulos) {
				System.out.println(elto);
			}
		}else {
			System.out.println("No hay triangulos");
		}
		
	}
	public void area_pantalla() {
		int total = 0;
		
		if(rectangulos.size()!=0) {
		for(int x = 0;x<rectangulos.size();x++) {
			total+=this.rectangulos.get(x).area();
		}
		}else {
			System.out.println("No hay rectangulos");
		}
		if(triangulos.size()!=0) {
		for(int x = 0;x<triangulos.size();x++) {
			total+=this.triangulos.get(x).area();
		}
		}else {
			System.out.println("No hay triangulos");
		}
		
		System.out.println("El area total es de "+ total);
		
	}
	
	public void muestra_pantalla() {
		
		if(rectangulos.size()!=0) {
		for(int x = 0;x<rectangulos.size();x++) {
			this.rectangulos.get(x).dibujar();;
		}
		}else {
			System.out.println("No hay cuadrados");
		}
		if(triangulos.size()!=0) {
		for(int x = 0;x<triangulos.size();x++) {
			this.triangulos.get(x).dibujar();
		}
		}else {
			System.out.println("No hay triangulos");
		}
		
	}


	@Override
	public String toString() {
		return "Pantalla [rectangulos=" + rectangulos + ", triangulos=" + triangulos + "]";
	}
		
	
		
	}
	
	


