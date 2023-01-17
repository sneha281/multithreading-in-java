class Main implements Runnable{
    public void run() {
        for(int i =0;i<10;i++) {
            System.out.println(i);
            try{Thread.sleep(100);
            }
            catch(Exception e){
                
            }
        }
    }


	public static void main(String[] args) {
		Main t = new Main();
		Thread thread = new Thread(t);
		thread.start();
	}
}
