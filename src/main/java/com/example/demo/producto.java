package com.example.demo;

import java.util.ArrayList;

public class producto {
	private Integer id;
	private String nombre;
	private String cantidad;
	
	public producto(Integer id, String nombre, String cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		
	}
	
	public static ArrayList<producto> createList(){
		ArrayList<producto> lista = new ArrayList<>();
		
		lista.add(new producto(1,"Producto 1","10"));
		lista.add(new producto(2,"Producto 2","5"));
		lista.add(new producto(3,"Producto 3","25"));
		lista.add(new producto(4,"Producto 4","15"));
		lista.add(new producto(5,"Producto 5","30"));
		
		
		
		
		return lista;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
