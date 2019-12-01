package ApiPagamento.com.br;

public class PagSaida {
	
	public long getCodPagamento() {
		return codPagamento;
	}

	public void setCodPagamento(long codPagamento) {
		this.codPagamento = codPagamento;
	}

	public long getNcartao() {
		return ncartao;
	}

	public void setNcartao(long ncartao) {
		this.ncartao = ncartao;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public int getCodSeg() {
		return codSeg;
	}

	public void setCodSeg(int codSeg) {
		this.codSeg = codSeg;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	private long codPagamento;
	private long ncartao;
	private int validade;
	private int codSeg;
	private double valorPagamento;


	public PagSaida(long codPagamento, long ncartao, int validade, int codSeg, double valorPagamento) {
		this.codPagamento = codPagamento;
		this.ncartao = ncartao;
		this.validade = validade;
		this.codSeg = codSeg;
		this.valorPagamento = valorPagamento;

	}

	public PagSaida(Pagamento pgto) {
		this.codPagamento = pgto.getCodPagamento();
		this.ncartao = pgto.getNcartao();
		this.validade = pgto.getValidade();
		this.codSeg = pgto.getCodSeg();
		this.valorPagamento = pgto.getValorPagamento();
	}


}
