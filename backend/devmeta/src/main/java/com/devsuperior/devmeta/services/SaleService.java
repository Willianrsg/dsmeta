package com.devsuperior.devmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.devmeta.entities.Sale;
import com.devsuperior.devmeta.repositories.SaleRepository;

@Service //REGISTRANDO O SALESERVICE COMO COMPONENTE DO SISTEMA
public class SaleService {
	
	@Autowired // ANNOTATION QUE FAZ A IMPORTAÇÃO AUTOMATICAMENTE
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}























