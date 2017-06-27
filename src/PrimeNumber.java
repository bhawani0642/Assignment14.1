
public class PrimeNumber extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			boolean flag = true;
			for (int j = 2; j < i - 1; j++) {

				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.print(i);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PrimeNumber pr = new PrimeNumber();
		pr.start();
		PrimeNumber1 pr1 = new PrimeNumber1();
		Thread t1 = new Thread(pr1);
		t1.start();

	}

}

class PrimeNumber1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			boolean flag = true;
			for (int j = 2; j < i - 1; j++) {

				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.print(i);
			System.out.println();

		}
	}

}
