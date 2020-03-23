package com.certificatic.mibanco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certificatic.mibanco.model.Tarjeta;
import com.certificatic.mibanco.repository.TarjetaRepository;

@Service
public class TarjetaServiceImpl implements TarjetaService {

	@Autowired
	private TarjetaRepository repository;
	
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		return repository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		return repository.obtenerTarjetas();
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		repository.eliminarTarjeta(numeroTarjeta);
	}

	
}
