package org.tzi.use.uran.visitor;

public final class ThreadCounter extends Thread{
	
	private InvPrintVisitor solver;
	private int timeout;
	private	int counter=0;
	public ThreadCounter(InvPrintVisitor solver, int timeout){
		this.solver = solver;
		this.timeout = (timeout < 120) ? 120 : timeout;
	}

	public void run(){
		try{
			while (counter++<=timeout){
				Thread.sleep(1000);
				if (!solver.isAlive()) this.interrupt();
			}
			if (solver.isAlive()) {
				System.err.println("Timed out.");
				solver.interrupt();
				System.exit(0);
			}
		}
		catch (InterruptedException e){
			
		}
	}
}
