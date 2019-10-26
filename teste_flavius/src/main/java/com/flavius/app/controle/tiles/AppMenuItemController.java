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
package com.flavius.app.controle.tiles;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.tiles.ComponentContext;


import com.powerlogic.jcompany.comuns.PlcException;
import com.powerlogic.jcompany.controle.PlcConstantes;
import com.powerlogic.jcompany.controle.tiles.PlcMenuItemController;

/**
* teste_flavius . Exemplo de l�gica de controle aplicada aos �tens de menu. 
*/
public class AppMenuItemController  extends PlcMenuItemController {

	/**
	 * Exemplo de altera��o dinamica de itens de menu
	 */
	@Override
	public void execute (ComponentContext context,
            HttpServletRequest request,
            HttpServletResponse response,
			javax.servlet.ServletContext servletContext)
            throws PlcException	{

		// Pega bloco de itens do contexto Tiles
		List l = (List) context.getAttribute(PlcConstantes.GUI.MENU.TILES_DEF_MENU_ITENS);
		
		// Instanciar colecao transiente, em escopo de sess�o ou requisi�ao.
		// Lista lNova = new ArrayList();
		
		// Fazer l�gicas para averiguar itens que importam, adicionando o que for preciso
		
		// Incluir a nova cole�ao no contexto
		//context.putAttribute(PlcConstantes.GUI.MENU.TILES_DEF_MENU_ITENS,lNova);
				
		// Nao esquecer de chamar programa��o do framework
		super.execute(context,request,response,servletContext);
		
	}

}
