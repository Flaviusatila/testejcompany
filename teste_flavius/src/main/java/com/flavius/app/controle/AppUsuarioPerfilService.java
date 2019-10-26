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
 * teste_flavius . Implementar aqui lógicas de perfil do usuário
 * da aplicação (user profiling)
 */
public class AppUsuarioPerfilService extends PlcBaseUsuarioPerfilService {
	/**
	 * jCompany 5.0: Lógicas de Inicialização de Perfil de Usuario
	 * Recebe a requisição, o perfil do usuário preenchido no ancestral e 
	 * a interface para chamada da persistência.
	 *
	 * Preencher o objeto de Perfil com informações específicas, especializando-o
	 * se necessário.
	 */
	@Override
	public PlcBaseUsuarioPerfilVO registraPerfilEspecifico(HttpServletRequest request,
			 HttpServletResponse response, PlcBaseUsuarioPerfilVO plcPerfilVO, IPlcFacade plcImpl) throws Exception {
		// Importante transformar o valor de String para Object, do exemplo
		// que vem no jCompany
		Map<String,Object> m = new HashMap<String,Object>();
		IAppFacade facade = (IAppFacade) plcImpl;
		   
		// Nova cláusula contratual da aplicacao, para recuperar
		// preferencias a partir do login do usuário
		// MeuPerfil meuPerfil =
		// facade.recuperaMeuPerfil(plcPerfilVO.getLogin());
		AppUsuarioPerfilVO appUsuarioPerfilVO = (AppUsuarioPerfilVO) plcPerfilVO;
		// coloca preferencias genéricas
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
		// se usuário for Administrador Geral, adicionar essa role no perfil
		if(request.isUserInRole("Administrador Geral Plc")) {
			List grupos = new ArrayList(1);
			grupos.add("Administrador Geral");
			plcPerfilVO.setGrupos(grupos);
		}

		// Retorna objeto modificado
		return plcPerfilVO;

		}
}

