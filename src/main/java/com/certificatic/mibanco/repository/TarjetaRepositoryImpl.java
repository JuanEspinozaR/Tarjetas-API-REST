package com.certificatic.mibanco.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.certificatic.mibanco.model.MARCA;
import com.certificatic.mibanco.model.Tarjeta;


@Repository
public class TarjetaRepositoryImpl implements TarjetaRepository{
	private static List<Tarjeta> tarjetas = new ArrayList<>();
	
	static {
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setCvv("983");
		tarjeta.setFechaCaducidad("08/24");
		tarjeta.setId(1);
		tarjeta.setMarca(MARCA.MASTERCARD);
		tarjeta.setNombreEntidad("BBVA");
		tarjeta.setNombreTitular("Juan Angel Espinoza Ramírez");
		tarjeta.setNumeroTarjeta("9812473829304818");
		tarjetas.add(tarjeta);
	}
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		tarjetas.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		return tarjetas;
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		
		for(int i =0 ; i <tarjetas.size(); i ++) {
			if(numeroTarjeta.equalsIgnoreCase(tarjetas.get(i).getNumeroTarjeta()))
				tarjetas.remove(i);
		}
			
	}

}
