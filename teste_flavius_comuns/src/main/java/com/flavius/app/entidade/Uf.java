package com.flavius.app.entidade;


import com.powerlogic.jcompany.comuns.PlcBaseVO;
import com.powerlogic.jcompany.dominio.valida.PlcValidacaoUnificada;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;

@MappedSuperclass
@PlcValidacaoUnificada
public abstract class Uf extends PlcBaseVO {

	
	@Id @GeneratedValue(strategy=GenerationType.AUTO, generator = "SE_UF")
	@Column (name = "ID_UF", nullable=false, length=5)
	private Long id;

	
	@Column (name = "UF", nullable=false, length=50)
	private String uf;
	
	@Column (name = "SIGLA_UF", nullable=false, length=2)
	private String siglaUf;
	
	@Column (name = "REGIAO", nullable=false, length=50)
	private String regiao;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf=uf;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf=siglaUf;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao=regiao;
	}

}
