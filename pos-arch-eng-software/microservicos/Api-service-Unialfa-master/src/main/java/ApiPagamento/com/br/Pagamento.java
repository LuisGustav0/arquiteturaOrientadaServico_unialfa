package ApiPagamento.com.br;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pagamento {
	
	private long ncartao;
	private int validade;
	private int codSeg;
	private double valorPagamento;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private long codPagamento;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codPagamento ^ (codPagamento >>> 32));
		result = prime * result + codSeg;
		result = prime * result + (int) (ncartao ^ (ncartao >>> 32));
		result = prime * result + validade;
		long temp;
		temp = Double.doubleToLongBits(valorPagamento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		if (codPagamento != other.codPagamento)
			return false;
		if (codSeg != other.codSeg)
			return false;
		if (ncartao != other.ncartao)
			return false;
		if (validade != other.validade)
			return false;
		if (Double.doubleToLongBits(valorPagamento) != Double.doubleToLongBits(other.valorPagamento))
			return false;
		return true;
	}
	
	


	public long getCodPagamento() {
		return codPagamento;
	}
	public void setCodPagamento(long codPagamento) {
		this.codPagamento = codPagamento;
	}
	public long getNcartao() {
		return ncartao;
	}
	public void setNcartao(long nrocartao) {
		this.ncartao = nrocartao;
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
	public void setCodSeg(int codSeguranca) {
		this.codSeg = codSeguranca;
	}
	public double getValorPagamento() {
		return valorPagamento;
	}
	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	
	
}
