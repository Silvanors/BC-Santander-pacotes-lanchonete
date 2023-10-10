package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação
		/*
		 * Ações que foram modificadas para métodos private na classe Cozinheiro
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();
		*/
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		/*
		 * A Classe Almoxarife deixa de existir na Classe Estabelecimento ficando visivél
		 * somente para o cozinheiro com os métodos private.
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		*/
		
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		/*
		 * Métodos abaixo ajustados e não precisam ser vistos pela Classe Estabelecimento. 
		 * almoxarife.entregarIngredientes();
		 * almoxarife.trocarGas();
		*/
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		/*
		 * Depois de alterar os métodos para private ou default a Classe Estabelecimento visualizará somente o método
		 * "servindoMesa()" e "receberPagamento".
		atendente.pegarLancheCozinha();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		atendente.trocarGas();
		*/
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		/*
		 *No decorrer do desenvolvimento a Classe responsável por servir será a  
		 *Classe Atendente.
		 cliente.pegarPedidoBalcao(); 
		 */
		
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		/*
		 * No decorrer do desenvolvimento o médoto "consultarSaldoAplicativo()" ficará privado na Classe Cliente
		 *cliente.consultarSaldoAplicativo();
		 */
		
		//já pensou os clientes ouvindo que o gás acabou ?
		/*
		 * A troca de gás ficou com a Classe Almoxarife com o método private pela Classe Cozinheiro
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);*/
		
	}
}