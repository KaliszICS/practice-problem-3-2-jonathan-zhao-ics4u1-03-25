public class PracticeProblem { //change to 1.40.0 version of language support for java

	public static void main(String args[]) {

	}

	public static int towerOfHanoi(int num) {
		if (num < 3) {
			return -1;
			
		}
		return (int) Math.pow(2, num) - 1;
	}

}

// 1 disc takes = 1
// 2 discs takes = 3
// 3 discs takes = 7
// 4 discs takes = 15
// 5 discs takes = 31

// 2 
// 4
// 8
// 16

//2x2
//4x2
//8x2

// 2^numOfDiscs - 1
// 1 discs = 2^1 - 1 = 1
// 2 discs = 2^2 - 1 = 3
// 3 discs = 2^3 - 1 = 7
// 4 discs = 2^4 - 1 = 15
// 5 discs = 2^5 - 1 = 31
