/**
 * A classe carro cont�m m�todos para realizar opera��es:
 * <ul>
 * 		<li>Meter Combustivel<li>
 * 		<li>O carro andar<li>
 * 		<li>O carro parar<li>
 * 		<li>Ver a autonomia do carro<li>
 * @author gabri
 *
 */
public class Carro {
	//Consumo do carro (km/l)
	static private final double consumo=5.5; // litros por 100 klm
	//Reabastecer, neste momento � 0
	private double quantidadeCombustivel;
	//Combustivel que o carro leva
	private double capacidadeDeposito;
	
	// Construtor por defeito 
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 

	public static double getConsumo() {
		return consumo;
	}

	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	// M�todos 
	/**
	 * Adiciona combustivel ao carro.
	 * @param quantidade
	 */
	
	public void meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o dep�sito
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	
	/**
	 * V� quantos litros encheu.
	 * @return N�mero de litros postos
	 */
	// atestar o dep�sito
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	/**
	 * Carro anda at� ter combustivel.
	 * @param distancia
	 * @return Se o carro anda ou fica parado.
	 */
	// distancia em klm
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente n�o percorre qualquer distancia 
			// ou anda at� parar porque fica sem combust�vel 
			return false;
		}
			
			
	}
	
	public boolean parar() {
		
		// se estiver a andar p�ra 
		// falta a flag que indica se o carro est� em andamento
		return true;
	}
	/**
	 * V� autonomia.
	 * @return autonomia.
	 */
	// kmCombustivel( )    
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
