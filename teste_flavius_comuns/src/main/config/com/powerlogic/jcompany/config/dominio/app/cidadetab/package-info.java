/** ******************************** LÓGICA-PADRÃO: TABULAR *************************************
 *  ******************************************************************************************/
@PlcConfigGrupoAgregacao(
		entidade = com.flavius.app.entidade.CidadeEntity.class,
		classesLookup = {com.flavius.app.entidade.UfEntity.class},
		padrao = @PlcConfigPadrao(logica = PlcConfigPadrao.Logica.TABULAR,
									complexidade = PlcConfigPadrao.Complexidade.SIMPLES,
									exclusaoModo = PlcConfigPadrao.ExclusaoModo.FISICA)
	)
	
//Gerado em 26/10/2019 19:22 por jCompany Code Generator
package com.powerlogic.jcompany.config.dominio.app.cidadetab;

import com.powerlogic.jcompany.config.dominio.PlcConfigGrupoAgregacao;
import com.powerlogic.jcompany.config.dominio.PlcConfigPadrao;
