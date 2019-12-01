package ApiPagamento.com.br;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamento")
public class PagResource {

	@Autowired
	private PagService pgtoService;

	@GetMapping
	public List<PagSaida> listar() {
		return pgtoService.listar();
	}

	@GetMapping("/{codPagamento}")
	public ResponseEntity<PagSaida> buscar(@PathVariable Long codPagamento) {
		
		
		PagSaida pgtoDtoSaida = pgtoService.buscar(codPagamento);
		if(pgtoDtoSaida == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(pgtoDtoSaida);
		}

	}

	@PostMapping
	public PagSaida adicionar(@RequestBody PagEntrada pgtoDtoEntrada) {
		return pgtoService.adicionar(pgtoDtoEntrada);
	}

	@PutMapping("/{codPagamento}")
	public PagSaida adicionar(@RequestBody PagEntrada pgtoDtoEntrada, @PathVariable Long codPagamento) {
		return pgtoService.alterar(pgtoDtoEntrada, codPagamento);
	}

	@DeleteMapping("/{codPagamento}")
	public void excliur(@PathVariable Long codPagamento) {
		pgtoService.excluir(codPagamento);
	}

}
