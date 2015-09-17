package MainPackage;
// create class 
public class MyInteger {
// create field 
	private int value;
// create constructor
	public MyInteger(int value) {
		this.value = value;
	}
// create getter 
	public int getValue() {
		return value;
	}
// create public isEven(), is Odd(), isPrime()
	public boolean isEven() {
		if (this.getValue() % 2 == 0)
			return true;
		else
			return false;

	}

	public boolean isOdd() {
		if (this.getValue() % 2 == 1)
			return true;
		else
			return false;

	}

	public boolean isPrime() {
		int j;
		for (int j1 = 2; j1 < this.getValue(); j1++) {
			if (this.value % j1 == 0) {
				return false;
			}
		}
		return true;
	}
// create static public isEven(int), is Odd(int), isPrime(int)
	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true;
		else
			return false;

	}

	public static boolean isOdd(int value) {
		if (value % 2 == 1)
			return true;
		else
			return false;

	}

	public static boolean isPrime(int value) {
		int j;
		for (int j1 = 2; j1 < value; j1++) {
			if (value % j1 == 0) {
				return false;
			}
		}
		return true;
	}

// create static public isEven(MyInteger), is Odd(MyInteger), isPrime(MyInteger)
	public static boolean isEven(MyInteger MyInt) {
		if (MyInt.getValue() % 2 == 0)
			return true;
		else
			return false;

	}

	public static boolean isOdd(MyInteger MyInt) {
		if (MyInt.getValue() % 2 == 1)
			return true;
		else
			return false;

	}

	public static boolean isPrime(MyInteger MyInt) {
		int j;
		for (int j1 = 2; j1 < MyInt.getValue(); j1++) {
			if (MyInt.getValue() % j1 == 0) {
				return false;
			}
		}
		return true;
	}


// create isEquals(int) isEquals(MyInteger)
	public boolean equals(int value) {
		if (value == this.value )
			return true;
		else
			return false;
	}

	public boolean equals(MyInteger MyInt) {
		if (MyInt.getValue() == this.value )
			return true;
		else
			return false;
	}

// create static parseint(char[]) parseint(string[])
	public static int parseint(char[ ] thisChar){
		int sum =0;
		for(int i=0; i< thisChar.length; i++){
			if (Character.isDigit(thisChar[i]) == true){
				sum += Character.getNumericValue(thisChar[i]);
				System.out.println(sum);}
			else
				continue;}
		return sum;

			
		}
	public static int parseint(String[ ] thisString){
		int sum = 0;
		String regex = "[0-9]+";
		for(int i=0; i< thisString.length; i++){
			if (thisString[i].matches(regex)){
			//	sum+= thisString[i]; I couldnt figure how to get string value and add
				}
			else
				continue;}
		return sum;

			
		}
		
		
	}
