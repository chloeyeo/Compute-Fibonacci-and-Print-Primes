void printPrimes(int max) {
	for (int n = 2; n <= max ; n++) {
		boolean prime = true;
	    double squareRootOfN = Math.sqrt(n);
		for (int f = 2; f <= squareRootOfN; f++) {
		    if (n%f == 0) {
			    prime = false;
			}
		}
		if (prime == true) {
		    System.out.println(n + " is prime");
		}
	}
}
    