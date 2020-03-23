package com.certificatic.mibanco.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.certificatic.mibanco.model.Tarjeta;
import com.certificatic.mibanco.service.TarjetaService;

@RestController
@RequestMapping("/api/v1/tarjeta")
public class TarjetaAPI {
	
	@Autowired
	private TarjetaService tarjetaService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	Tarjeta crearTarjeta (@RequestBody Tarjeta tarjeta) {
		return tarjetaService.crearTarjeta(tarjeta);
	}
	
	@GetMapping
	List<Tarjeta> obtenerTarjetas(){
		return tarjetaService.obtenerTarjetas();
	}
	
	/*@GetMapping
	void eliminarTarjeta(String numeroTarjeta) {
		tarjetaService.eliminarTarjeta(numeroTarjeta);
	}*/
}
