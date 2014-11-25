package david;

class MiHebra extends Thread{
	
	public MiHebra(String name){
		super(name);
	}
	public void run(){
		System.out.println("Iniciada hebra: "+this);
		while(true);
	}
}

public class Prioridades {

	public static void main(String[] args) {
		MiHebra mh;
		
		mh = new MiHebra("Rapida");
		mh.setPriority(Thread.MAX_PRIORITY);
		mh.start();
		
		mh = new MiHebra("Lenta");
		mh.setPriority(Thread.MIN_PRIORITY);
		mh.start();
	}

}
