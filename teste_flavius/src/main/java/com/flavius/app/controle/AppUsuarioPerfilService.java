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
package com.flavius.app.controle;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flavius.app.comuns.AppUsuarioPerfilVO;
import com.flavius.app.facade.IAppFacade;

import com.powerlogic.jcompany.comuns.PlcBaseUsuarioPerfilVO;
import com.powerlogic.jcompany.comuns.facade.IPlcFacade;
import com.powerlogic.jcompany.controle.service.PlcBaseUsuarioPerfilService;

/**
 * teste_flavius . Implementar aqui l�gicas de perfil do usu�rio
 * da aplica��o (user profiling)
 */
public class AppUsuarioPerfilService extends PlcBaseUsuarioPerfilService {
	/**
	 * jCompany 5.0: L�gicas de Inicializa��o de Perfil de Usuario
	 * Recebe a requisi��o, o perfil do usu�rio preenchido no ancestral e 
	 * a interface para chamada da persist�ncia.
	 *
	 * Preencher o objeto de Perfil com informa��es espec�ficas, especializando-o
	 * se necess�rio.
	 */
	@Override
	public PlcBaseUsuarioPerfilVO registraPerfilEspecifico(HttpServletRequest request,
			 HttpServletResponse response, PlcBaseUsuarioPerfilVO plcPerfilVO, IPlcFacade plcImpl) throws Exception {
		// Importante transformar o valor de String para Object, do exemplo
		// que vem no jCompany
		Map<String,Object> m = new HashMap<String,Object>();
		IAppFacade facade = (IAppFacade) plcImpl;
		   
		// Nova cl�usula contratual da aplicacao, para recuperar
		// preferencias a partir do login do usu�rio
		// MeuPerfil meuPerfil =
		// facade.recuperaMeuPerfil(plcPerfilVO.getLogin());
		AppUsuarioPerfilVO appUsuarioPerfilVO = (AppUsuarioPerfilVO) plcPerfilVO;
		// coloca preferencias gen�ricas
		// appUsuarioPerfilVO.setMeuPerfil(meuPerfil);

		/*
			   
		if (meuPerfil != null) {
			// Exemplo multi-empresa
			if (meuPerfil.getEmpresa()!=null)
				appUsuarioPerfilVO.setIdEmpresa(meuPerfil.getEmpresa().getId());
			if (meuPerfil.getDivisao()!=null)
				appUsuarioPerfilVO.setIdSubEmpresa(meuPerfil.getDivisao().getId());
			// coloca os filtros
			if (!request.isUserInRole("Administrador")) {
				if (request.isUserInRole("Empresa"))
					m.put("empresa", meuPerfil.getEmpresa().getId());
				if (request.isUserInRole("EmpresaDivisao")) {
				    m.put("empresa", meuPerfil.getEmpresa().getId());
				    m.put("divisao", meuPerfil.getDivisao().getId());
				}
			}
		}

	   */

		// Deve estar ao final da montagem do Map
		appUsuarioPerfilVO.getPlcSegurancaVertical().putAll(m);
		// se usu�rio for Administrador Geral, adicionar essa role no perfil
		if(request.isUserInRole("Administrador Geral Plc")) {
			List grupos = new ArrayList(1);
			grupos.add("Administrador Geral");
			plcPerfilVO.setGrupos(grupos);
		}

		// Retorna objeto modificado
		return plcPerfilVO;

		}
}

