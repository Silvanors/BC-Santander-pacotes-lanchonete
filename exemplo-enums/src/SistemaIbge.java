
public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro itens: EstadoBrasileiro.values()) {
			System.out.println(itens.getSigla() + " - " + itens.getNome());
		}
		
		EstadoBrasileiro itensb = EstadoBrasileiro.PIAUI;
		
		System.out.println(itensb.getNome());
		System.out.println(itensb.getSigla());
		System.out.println(itensb.getNomeMaiusculo());
		System.out.println(itensb.getIbge());
	}

}
