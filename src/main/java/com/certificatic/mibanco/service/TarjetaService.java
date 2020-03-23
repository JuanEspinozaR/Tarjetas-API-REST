package com.certificatic.mibanco.service;

import java.util.List;

import com.certificatic.mibanco.model.Tarjeta;

public interface TarjetaService {
	Tarjeta crearTarjeta (Tarjeta tarjeta);
	List<Tarjeta> obtenerTarjetas();
	void eliminarTarjeta(String numeroTarjeta);
}
