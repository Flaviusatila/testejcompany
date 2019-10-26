package com.flavius.app.entidade;


import com.powerlogic.jcompany.comuns.PlcBaseVO;
import com.powerlogic.jcompany.dominio.valida.PlcValidacaoUnificada;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import org.hibernate.annotations.ForeignKey;
import javax.persistence.GeneratedValue;

@MappedSuperclass
@PlcValidacaoUnificada
public abstract class Cidade extends PlcBaseVO {

	
	@Id @GeneratedValue(strategy=GenerationType.AUTO, generator = "SE_CIDADE")
	@Column (name = "ID_CIDADE", nullable=false, length=5)
	private Long id;

	
	@Column (name = "NOME", nullable=false, length=50)
	private String nome;
	
	@Column (name = "CEP", nullable=false, length=10)
	private String cep;
	
	@SuppressWarnings("unchecked")
	@ManyToOne (targetEntity = UfEntity.class, fetch = FetchType.LAZY)
	@ForeignKey(name="FK_CIDADE_ESTADO")
	@JoinColumn (name = "ID_ESTADO", nullable=false)
	private Uf estado;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome=nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep=cep;
	}

	public Uf getEstado() {
		return estado;
	}

	public void setEstado(Uf estado) {
		this.estado=estado;
	}

}
