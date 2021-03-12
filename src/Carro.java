/**
 * A classe carro contém métodos para realizar operações:
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
	//Reabastecer, neste momento é 0
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
	
	// Métodos 
	/**
	 * Adiciona combustivel ao carro.
	 * @param quantidade
	 */
	
	public void meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o depósito
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	
	/**
	 * Vê quantos litros encheu.
	 * @return Número de litros postos
	 */
	// atestar o depósito
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	/**
	 * Carro anda até ter combustivel.
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
			
			// Aqui ou simplesmente não percorre qualquer distancia 
			// ou anda até parar porque fica sem combustível 
			return false;
		}
			
			
	}
	
	public boolean parar() {
		
		// se estiver a andar pára 
		// falta a flag que indica se o carro está em andamento
		return true;
	}
	/**
	 * Vê autonomia.
	 * @return autonomia.
	 */
	// kmCombustivel( )    
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
