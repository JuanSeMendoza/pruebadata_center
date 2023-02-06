package com.datacenter.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datacenter.dao.RecargaDAO;
import com.datacenter.model.Tbl_Recargas;

@RestController
@RequestMapping("recarga") 
public class RecargaRest {

	@Autowired
	private RecargaDAO recargaDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Tbl_Recargas recargas) {
		recargaDAO.save(recargas);
	}
	@GetMapping("/listar")
	public List<Tbl_Recargas> listar(){
	 return recargaDAO.findAll();		
	}
	@DeleteMapping("/eliminar/{id_recarga}")
	public void eliminar(@PathVariable("id_recarga") Integer id_recarga) {
		recargaDAO.deleteById(id_recarga);
	}
	


}
