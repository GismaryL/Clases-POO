package paq2;

public class CarritoCompras {

	public static void main(String[] args) {
		Producto prod1 = new Producto (100, "Leche", 230.50, "Leche larga vida caja 1L", 100);
		Producto prod2 = new Producto (101, "Pan", 180.50, "Pan por Kg", 100);
		System.out.println ("El producto 1: "+prod1.un_nombre()+ " "+ prod1.un_descripcion());
		System.out.println ("El producto 2: "+prod2.un_nombre()+ " "+ prod2.un_descripcion());
	}

}
