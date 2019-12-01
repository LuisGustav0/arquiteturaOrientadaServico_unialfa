package ApiPagamento.com.br;

public class PagEntrada {
	
	private long ncartao;
	private int validade;
	private int codSeg;
	private double valorPagamento;

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

	public void setValorPagamento(int valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	

	public PagEntrada() {
	}

	public PagEntrada(long ncartao, int validade, int codSeg, double valorPagamento) {
		this.ncartao = ncartao;
		this.validade = validade;
		this.codSeg = codSeg;
		this.valorPagamento = valorPagamento;

	}

}
