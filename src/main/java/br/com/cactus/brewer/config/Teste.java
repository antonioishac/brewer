package br.com.cactus.brewer.config;

public class Teste {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(">>>> INICIO <<<<");
		Long tempoInicio = System.currentTimeMillis();
		
		Thread.sleep(60000);
		
		System.out.println((System.currentTimeMillis() - tempoInicio) / 1000);
		
		System.out.println(">>>>  FIM  <<<<");
	}

}
