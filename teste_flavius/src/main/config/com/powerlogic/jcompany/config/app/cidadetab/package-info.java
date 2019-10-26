/** ******************************** LÓGICA-PADRÃO: TABULAR *************************************
 *  ******************************************************************************************/
	
/**
 * Meta-dados para a camada de controle. Define preferências e inversões de controle de uso somente da camada controle
 */	
@PlcConfigGrupoControle(

	action = com.flavius.app.controle.jsf.cidade.CidadeAction.class,
	
	/**
	 * Usa layout universal
	 */	
	layoutUniversal = @PlcConfigLayoutUniversal(
						dirBaseFacelets = "/WEB-INF/fcls/cidade"
						),


	tabular = @PlcConfigTabular(
				propReferenciaDesprezar = "nome",
				testaDuplicataFlagDesprezar = true,
				numeroNovos = 4)
				
	
,
		comportamento = @PlcConfigComportamento(detalheLembra = true)
)
	
//Gerado em 26/10/2019 19:22 por jCompany Code Generator
package com.powerlogic.jcompany.config.app.cidadetab;

import com.powerlogic.jcompany.config.controle.colaboracao.PlcConfigGrupoControle;
import com.powerlogic.jcompany.config.comuns.PlcConfigComportamento;
import com.powerlogic.jcompany.config.controle.colaboracao.PlcConfigTabular;
import com.powerlogic.jcompany.config.controle.colaboracao.PlcConfigLayoutUniversal;
