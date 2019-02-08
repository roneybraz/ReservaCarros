package reserva.carros.modelo;

import java.util.List;

public class ReservaCarros {
	
	
	private long id;
	private Tipo_Carro tipoCarro;
	private String TipodeCliente;
	private int QuantidadePessoas;
	private String dataInicio;
	private String dataFim;
	
	
	
	public String getTipodeCliente() {
		return TipodeCliente;
	}
	public void setTipodeCliente(String tipodeCliente) {
		TipodeCliente = tipodeCliente;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Tipo_Carro getTipoCarro() {
		return tipoCarro;
	}
	public void setTipoCarro(Tipo_Carro tipoCarro) {
		this.tipoCarro = tipoCarro;
	}
	public int getQuantidadePessoas() {
		return QuantidadePessoas;
	}
	public void setQuantidadePessoas(int quantidadePessoas) {
		QuantidadePessoas = quantidadePessoas;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	

}
