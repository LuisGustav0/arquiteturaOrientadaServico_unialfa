package ApiPagamento.com.br;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ApiPagamento.com.br.Pagamento;
import ApiPagamento.com.br.PagEntrada;
import ApiPagamento.com.br.PagSaida;
@Service
public class PagService {
	@Autowired
	private PagRepository pgtoRepository;

	public List<PagSaida> listar() {

		List<PagSaida> lista = null;

		List<Pagamento> listaPgto = pgtoRepository.findAll();
		for (Pagamento pgto : listaPgto) {
			if (lista == null) {
				lista = new ArrayList<PagSaida>();
			}

			PagSaida pgtoDtoSaida = new PagSaida(pgto);
			lista.add(pgtoDtoSaida);
		}

		return lista;

	}
	
	public PagSaida buscar(Long codPagamento) {
		PagSaida pgtoDtoSaida = null;
		Optional<Pagamento> pgtoOptional = pgtoRepository.findById(codPagamento);
		if(pgtoOptional.isPresent()) {
			Pagamento pgto = pgtoOptional.get();
			pgtoDtoSaida = new PagSaida(pgto);
		}
		return pgtoDtoSaida;
	}
	
	public PagSaida adicionar(PagEntrada pgtoDtoEntrda) {
		PagSaida pgtoDtoSaida = null;
		
		Pagamento pgto = new Pagamento();
		pgto.setCodSeg(pgtoDtoEntrda.getCodSeg());
		pgto.setNcartao(pgtoDtoEntrda.getNcartao());
		pgto.setValidade(pgtoDtoEntrda.getValidade());
		pgto.setValorPagamento(pgtoDtoEntrda.getValorPagamento());
		
		Pagamento pgtoSalva = pgtoRepository.save(pgto);
		if(pgtoSalva != null) {
			pgtoDtoSaida = new PagSaida(pgtoSalva);
		}
		
		return pgtoDtoSaida;
	}
	
	public PagSaida alterar(PagEntrada pgtoDtoEntrda, Long codReservaCarro) {
		PagSaida pgtoDtoSaida = null;
		
		Optional<Pagamento> pgtoOptional = pgtoRepository.findById(codReservaCarro);
		if(pgtoOptional.isPresent()) {
			Pagamento pgto = pgtoOptional.get();
			pgto.setCodSeg(pgtoDtoEntrda.getCodSeg());
			pgto.setNcartao(pgtoDtoEntrda.getNcartao());
			pgto.setValidade(pgtoDtoEntrda.getValidade());
			pgto.setValorPagamento(pgtoDtoEntrda.getValorPagamento());
			Pagamento pgtoSalva = pgtoRepository.save(pgto);
			if(pgtoSalva != null) {
				pgtoDtoSaida = new PagSaida(pgtoSalva);
			}
		}
		
		return pgtoDtoSaida;
	}
	
	public void excluir(Long codPagamento) {
		pgtoRepository.deleteById(codPagamento);
	}
	

}
