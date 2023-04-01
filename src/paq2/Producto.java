package paq2;

public class Producto {
	 
			private int codigo;
			private String nombre;
			private double precio;
			private String descripcion;
			private int stock;
			
			//creamos el metodo constructor Producto
		public Producto(int cod, String nom, double prec, String desc, int stck) {
				codigo = cod;
				nombre = nom;
				precio = prec;
				descripcion = desc;
				stock = stck;	
				
			}
			//metodos getters
		public int un_codigo () { //Producto prod = new Producto (101, "leche larga vida caja 1L", 100)
			return codigo; //prod1.un_codigo
		}
		
		public String un_nombre() {
			return nombre;
		}
		public double un_precio() {
			return precio;
		
		}
		public String un_descripcion() {
			return descripcion;
		
		}
		public int un_stock() {
			return stock;
		
		}

}

