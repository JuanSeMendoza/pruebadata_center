package com.datacenter.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.datacenter.model.Tbl_Recargas;

@Controller
@RequestMapping("/")
public class ControladorRecarga {
	
	private final Logger logg= LoggerFactory.getLogger(Tbl_Recargas.class);
	int Operador;
	
	@Autowired
	private RecargaDAO recargaDAO;
	
	@GetMapping("")
	public String home(){
		return "home";
	}
	
	@PostMapping("/guardar")
	public String guardar(Tbl_Recargas tbl_Recargas, String Operadorr) {
		System.out.println(Operadorr);
		System.out.println(tbl_Recargas.getFecha());
		System.out.println(tbl_Recargas.getFk_id_vendedor());
		logg.info("Informacin objeto, {}",tbl_Recargas);
		
		if(Operadorr != null) {
			switch (Operadorr) {
            case "Tigo" -> { Operador = 1 ;
            				tbl_Recargas.setFk_id_operador(Operador);
            				}
            case "Movistar" -> { Operador = 2 ;
								tbl_Recargas.setFk_id_operador(Operador);
								}
            case "Comcel" -> { Operador = 3 ;
								tbl_Recargas.setFk_id_operador(Operador);
								}
            case "Uff" -> { Operador = 4 ;
							tbl_Recargas.setFk_id_operador(Operador);
							}
            case "Etb" -> { Operador = 5 ;
							tbl_Recargas.setFk_id_operador(Operador);
							}
            default -> System.out.println("Error para ingreso");
        }
		}
		recargaDAO.save(tbl_Recargas);
		return "home";
	}

}
