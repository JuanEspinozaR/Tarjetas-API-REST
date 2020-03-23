package com.certificatic.mibanco.repository;

import java.util.List;

import com.certificatic.mibanco.model.Tarjeta;
public interface TarjetaRepository {
	
	Tarjeta crearTarjeta (Tarjeta tarjeta);
	List<Tarjeta> obtenerTarjetas();
	void eliminarTarjeta(String numeroTarjeta);
}
