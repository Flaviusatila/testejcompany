package com.flavius.app.entidade;


import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.AccessType;
import javax.persistence.Entity;
/**
 * Classe Concreta gerada a partir do assistente
 */
@Entity
@Table(name="CIDADE")
@SequenceGenerator(name="SE_CIDADE", sequenceName="SE_CIDADE")
@AccessType("field")


@SuppressWarnings("serial")
@NamedQueries({
	@NamedQuery(name="CidadeEntity.queryMan", query="from CidadeEntity obj"),
	@NamedQuery(name="CidadeEntity.querySelLookup", query="select new CidadeEntity (obj.id, obj.nome) from CidadeEntity obj where obj.id = ? order by obj.id asc")
})
public class CidadeEntity extends Cidade {
 	
    /*
     * Construtor padrão
     */
    public CidadeEntity() {
    }
	public CidadeEntity(Long id, String nome) {
		this.setId(id);
		this.setNome(nome);
	}
	@Override
	public String toString() {
		return getNome();
	}

	@javax.persistence.Transient
	public Class[] getAgregadosLazyPlc() {
		return new Class[] {com.flavius.app.entidade.Uf.class};
	}

}
