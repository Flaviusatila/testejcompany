/*  																													
	    				   jCompany Developer Suite																		
			    		Copyright (C) 2008  Powerlogic																	
	 																													
	    Este programa � licenciado com todos os seus c�digos fontes. Voc� pode modific�-los e							
	    utiliz�-los livremente, inclusive distribu�-los para terceiros quando fizerem parte de algum aplicativo 		
	    sendo cedido, segundo os termos de licenciamento gerenciado de c�digo aberto da Powerlogic, definidos			
	    na licen�a 'Powerlogic Open-Source Licence 2.0 (POSL 2.0)'.    													
	  																													
	    A Powerlogic garante o acerto de erros eventualmente encontrados neste c�digo, para os clientes licenciados, 	
	    desde que todos os c�digos do programa sejam mantidos intactos, sem modifica��es por parte do licenciado. 		
	 																													
	    Voc� deve ter recebido uma c�pia da licen�a POSL 2.0 juntamente com este programa.								
	    Se n�o recebeu, veja em <http://www.powerlogic.com.br/licencas/posl20/>.										
	 																													
	    Contatos: plc@powerlogic.com.br - www.powerlogic.com.br 														
																														
 */ 
 /** ************************* META-DADOS GLOBAIS DA APLICA��O ******************************
  ********************** Configura��es padr�o para toda a aplica��o *************************
  ************ Obs: configura��es corporativas devem estar no n�vel anterior,****************
  ************              preferencialmente na camada Bridge               ****************
  *******************************************************************************************/

@PlcConfigGrupoControleAplicacao(
	navegacaoPadraoOtimizada="S",
	definicao=@PlcConfigAplicacaoDefinicao(grupoTecnologico=PlcConfigAplicacaoDefinicao.GrupoTecnologicoControleVisao.JSF_TRINIDAD_SEAM_FACELETS_JQUERY, nome="teste_flavius",sigla="teste_flavius",versao=1,release=0),
	controleIoC=@PlcConfigControleIoC(
		facadeImplementacaoPadrao="com.flavius.app.facade.AppFacadeImpl",
		contextPadrao="",
		perfilUsuario=@PlcConfigPerfilUsuario(
				voPadrao=com.flavius.app.comuns.AppUsuarioPerfilVO.class,
				implementacaoPadrao=com.flavius.app.controle.AppUsuarioPerfilService.class)),
	classesDominioDiscreto={},
	classesLookup={com.flavius.app.entidade.UfEntity.class}
)

/*
@PlcConfigComportamento
@PlcConfigModeloTecnologia ( tecnologia= PlcConfigModeloTecnologia.Tecnologia.EJB3)
@PlcConfigEjbFacadeRef(nomeFacadeApp="teste_flavius_ear/AppFacadeImpl/remote")
*/

package com.powerlogic.jcompany.config.app;
import com.powerlogic.jcompany.config.controle.geral.PlcConfigGrupoControleAplicacao;
import com.powerlogic.jcompany.config.controle.geral.PlcConfigAplicacaoDefinicao;
import com.powerlogic.jcompany.config.controle.geral.PlcConfigControleIoC;
import com.powerlogic.jcompany.config.controle.geral.PlcConfigPerfilUsuario;
import com.powerlogic.jcompany.config.controle.geral.PlcConfigModulo;
import com.powerlogic.jcompany.config.comuns.PlcConfigComportamento;
import com.powerlogic.jcompany.config.comuns.PlcConfigEjbFacadeRef;
import com.powerlogic.jcompany.config.comuns.PlcConfigModeloTecnologia; 
