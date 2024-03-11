package edu.ucjc.programacion.poo.composicion;

public class Oficina {
	
	public static void main(String[] args) {
		Mesa mesa = new Mesa(1,"blanco",300);
		Silla silla1 = new Silla(1,"blanca",75);
		Silla silla2 = new Silla(2,"blanca",75);
		
		Silla[] sillas = {silla1,silla2};
		
		Despacho despacho = new Despacho("DES-1",1);
		Despacho despacho2 = new Despacho("DES-2",1,mesa,sillas);
		
		System.out.println(despacho.getMesa().getColor());
		despacho.setMesa(mesa);
		System.out.println(despacho.getMesa().getColor());
		despacho2.getMesa().setColor("azul");
		System.out.println(despacho2.getMesa().getColor());
		System.out.println(despacho.getMesa().getColor());
		

		despacho2.getSillas()[1].getColor();
		
	}
	

}