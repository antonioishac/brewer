package br.com.cactus.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cactus.brewer.model.Estilo;
import br.com.cactus.brewer.repository.EstiloRepository;
import br.com.cactus.brewer.service.exception.NomeEstiloJaCadastradoException;

@Service
public class EstiloService {

	@Autowired
	private EstiloRepository estiloRepository;

	@Transactional
	public Estilo salvar(Estilo estilo) {

		Optional<Estilo> verificaNome = estiloRepository.findByNomeIgnoreCase(estilo.getNome());
		if (verificaNome.isPresent()) {
			throw new NomeEstiloJaCadastradoException("Nome do estilo já cadastrado");
		}

		return this.estiloRepository.saveAndFlush(estilo);
	}

}
