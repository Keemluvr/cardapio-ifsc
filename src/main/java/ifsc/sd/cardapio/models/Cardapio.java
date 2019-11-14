package ifsc.sd.cardapio.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Cardapio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private long dia;
	private long mes;
	private long ano;
	
	private String primeiroPrato;
	private String segundoPrato;
	private String terceiroPrato;
	private String quartoPrato;
	private String quintoPrato;
	private String sextoPrato;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDia() {
		return dia;
	}

	public void setDia(long dia) {
		this.dia = dia;
	}

	public long getMes() {
		return mes;
	}

	public void setMes(long mes) {
		this.mes = mes;
	}

	public long getAno() {
		return ano;
	}

	public void setAno(long ano) {
		this.ano = ano;
	}

	public String getPrimeiroPrato() {
		return primeiroPrato;
	}

	public void setPrimeiroPrato(String primeiroPrato) {
		this.primeiroPrato = primeiroPrato;
	}

	public String getSegundoPrato() {
		return segundoPrato;
	}

	public void setSegundoPrato(String segundoPrato) {
		this.segundoPrato = segundoPrato;
	}

	public String getTerceiroPrato() {
		return terceiroPrato;
	}

	public void setTerceiroPrato(String terceiroPrato) {
		this.terceiroPrato = terceiroPrato;
	}

	public String getQuartoPrato() {
		return quartoPrato;
	}

	public void setQuartoPrato(String quartoPrato) {
		this.quartoPrato = quartoPrato;
	}

	public String getQuintoPrato() {
		return quintoPrato;
	}

	public void setQuintoPrato(String quintoPrato) {
		this.quintoPrato = quintoPrato;
	}

	public String getSextoPrato() {
		return sextoPrato;
	}

	public void setSextoPrato(String sextoPrato) {
		this.sextoPrato = sextoPrato;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
