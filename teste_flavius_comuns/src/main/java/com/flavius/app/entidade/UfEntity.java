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
@Table(name="UF")
@SequenceGenerator(name="SE_UF", sequenceName="SE_UF")
@AccessType("field")


@SuppressWarnings("serial")
@NamedQueries({
	@NamedQuery(name="UfEntity.queryMan", query="from UfEntity obj"),
	@NamedQuery(name="UfEntity.querySelLookup", query="select new UfEntity (obj.id, obj.uf) from UfEntity obj where obj.id = ? order by obj.id asc")
})
public class UfEntity extends Uf {
 	
    /*
     * Construtor padrão
     */
    public UfEntity() {
    }
	public UfEntity(Long id, String uf) {
		this.setId(id);
		this.setUf(uf);
	}
	@Override
	public String toString() {
		return getUf();
	}

}
