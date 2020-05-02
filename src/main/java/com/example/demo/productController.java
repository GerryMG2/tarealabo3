package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class productController {
	
	public ArrayList<producto> listaProductos = producto.createList();

	@GetMapping("/formulario")
	public ModelAndView formulario(compra cp) {
		ModelAndView mav = new ModelAndView();
		
		for (producto producto : listaProductos) {
			System.out.println(producto.getNombre());
		}
		
		mav.setViewName("formulario");
		mav.addObject("lista", listaProductos);
		mav.addObject("compra", new compra());
		
		return mav;
	}
	
	@PostMapping("/formulario")
	public ModelAndView formularioPost(compra cp) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("err");
		System.out.println(Integer.valueOf(cp.getId()));
		System.out.println(cp.getCantidad());
		for (producto producto : listaProductos) {
			
			if(Integer.valueOf(cp.getId()) == producto.getId()) {
				if(Integer.valueOf(cp.getCantidad()) <= Integer.valueOf(producto.getCantidad())) {
					mav.setViewName("ok");
					mav.addObject("msg", "Tu producto se ha comprado");
				}else {
					mav.setViewName("err");
					mav.addObject("msg", "No hay suficiente producto");
				}
				break;
			}else {
				mav.setViewName("err");
				mav.addObject("msg", "NO existe el producto");
			}
		}
		
		return mav;
	}
	
}
