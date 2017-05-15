package br.com.cactus.brewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cactus.brewer.model.Cerveja;
import br.com.cactus.brewer.repository.CervejaRepository;

@Service
public class CadastroCervejaService {
	
	@Autowired
	private CervejaRepository cervejaRepository;
	
	@Transactional
	public void salvar(Cerveja cerveja) {
		cervejaRepository.save(cerveja);
	}

}
