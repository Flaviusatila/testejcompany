/*  																													
	    				   jCompany Developer Suite																		
			    		Copyright (C) 2008  Powerlogic																	
	 																													
	    Este programa é licenciado com todos os seus códigos fontes. Você pode modificá-los e							
	    utilizá-los livremente, inclusive distribuí-los para terceiros quando fizerem parte de algum aplicativo 		
	    sendo cedido, segundo os termos de licenciamento gerenciado de código aberto da Powerlogic, definidos			
	    na licença 'Powerlogic Open-Source Licence 2.0 (POSL 2.0)'.    													
	  																													
	    A Powerlogic garante o acerto de erros eventualmente encontrados neste código, para os clientes licenciados, 	
	    desde que todos os códigos do programa sejam mantidos intactos, sem modificações por parte do licenciado. 		
	 																													
	    Você deve ter recebido uma cópia da licença POSL 2.0 juntamente com este programa.								
	    Se não recebeu, veja em <http://www.powerlogic.com.br/licencas/posl20/>.										
	 																													
	    Contatos: plc@powerlogic.com.br - www.powerlogic.com.br 														
																														
 */ 
 /** ************************* META-DADOS GLOBAIS DA APLICAÇÃO ******************************
  ********************** Configurações padrão para toda a aplicação *************************
  ************ Obs: configurações corporativas devem estar no nível anterior,****************
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
