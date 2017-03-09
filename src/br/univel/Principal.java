package br.univel;

public class Principal {
	
	public Principal(){
		Exercicio e = new Exercicio();
		//Pode passar qualquer coisa pro construtor Thread()
		//desde que implemente Runnable
		new Thread(e).start();
		new Thread(e).start();
		new Thread(e).start();
		
		//Impossivel saber qual resultado sera exibido
		//por primeiro
		new Thread(
				new Runnable() {
					@Override
					public void run() {
						tarefa("P1");
					}
		}).start();
		new Thread(
				new Runnable() {
					@Override
					public void run() {
						tarefa("P2");
					}
		}).start();
		
		System.out.println("Thread principal livre.");
		
		HakunaMatata hm = new HakunaMatata();
		new Thread(hm).start();
//		tarefa("P1");
//		tarefa("P2");
	}

	private void tarefa(String nome) {
		for (int i = 0; i < 10; i++) {
			System.out.println(nome+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}
