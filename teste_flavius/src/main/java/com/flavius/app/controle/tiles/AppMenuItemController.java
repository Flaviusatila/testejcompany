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
package com.flavius.app.controle.tiles;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.tiles.ComponentContext;


import com.powerlogic.jcompany.comuns.PlcException;
import com.powerlogic.jcompany.controle.PlcConstantes;
import com.powerlogic.jcompany.controle.tiles.PlcMenuItemController;

/**
* teste_flavius . Exemplo de lógica de controle aplicada aos ítens de menu. 
*/
public class AppMenuItemController  extends PlcMenuItemController {

	/**
	 * Exemplo de alteração dinamica de itens de menu
	 */
	@Override
	public void execute (ComponentContext context,
            HttpServletRequest request,
            HttpServletResponse response,
			javax.servlet.ServletContext servletContext)
            throws PlcException	{

		// Pega bloco de itens do contexto Tiles
		List l = (List) context.getAttribute(PlcConstantes.GUI.MENU.TILES_DEF_MENU_ITENS);
		
		// Instanciar colecao transiente, em escopo de sessão ou requisiçao.
		// Lista lNova = new ArrayList();
		
		// Fazer lógicas para averiguar itens que importam, adicionando o que for preciso
		
		// Incluir a nova coleçao no contexto
		//context.putAttribute(PlcConstantes.GUI.MENU.TILES_DEF_MENU_ITENS,lNova);
				
		// Nao esquecer de chamar programação do framework
		super.execute(context,request,response,servletContext);
		
	}

}
