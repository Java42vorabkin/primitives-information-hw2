import java.util.Scanner;

//Application for printing out the useful information about Java integer primitives
public class PrimitivesInformationAppl {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in); //input data from the console
		while(true) {
			System.out.println("enter integer primitive type (long, int, short, char, byte or exit");
			String line = scanner.nextLine();
			if (line.equals("exit")) {
				break;
			}
			printInformationByType(line);
		}
		System.out.println("thanks for using our application & bye");

	}

	private static void printInformationByType(String type) {
		// your homework should contain switch by the given type (long, int, short, char, byte)
		//for default there should be out: Wrong primitive type
		// for each type there should be an appropriate method of printing information of the type
		//for example, printCharInformation - method printing out the info about type "char"
		switch(type) {
			case "long":
				printLongInformation();
				break;
			case "int":
				printIntInformation();
				break;
			case "short":
				printShortInformation();
				break;
			case "char":
				printCharInformation();
				break;
			case "byte":
				printByteInformation();
				break;
			default:
				System.out.printf("Unknown type %s\n",type);
				break;
		}
	}
	
	private static void printByteInformation() {
		byte minValue = 1; 
		int nBits = 1;
		while(minValue > 0) {
			minValue = (byte) (minValue * 2);//compiler casts minValue to int, multiplies on 2 
			nBits = nBits + 1;
		}
		byte maxValue = (byte) (minValue - 1);
		System.out.printf("char. minimal value is %d, maximal value is %d, number of bytes is %d\n", minValue, maxValue, nBits / 8);		
	}

	private static void printShortInformation() {
		short minValue = 1; 
		int nBits = 1;
		while(minValue > 0) {
			minValue = (short) (minValue * 2);//compiler casts minValue to int, multiplies on 2 
			nBits = nBits + 1;
		}
		short maxValue = (short) (minValue - 1);
		System.out.printf("short. minimal value is %d, maximal value is %d, number of bytes is %d\n", minValue, maxValue, nBits / 8);		
		
	}

	private static void printIntInformation() {
		int minValue = 1; 
		int nBits = 1;
		while(minValue > 0) {
			minValue = (minValue * 2);//compiler casts minValue to int, multiplies on 2 
			nBits = nBits + 1;
		}
		int maxValue = (minValue - 1);
		System.out.printf("int. minimal value is %d, maximal value is %d, number of bytes is %d\n", minValue, maxValue, nBits / 8);		
		
	}

	private static void printLongInformation() {
		long minValue = 1; 
		int nBits = 1;
		while(minValue > 0) {
			minValue = (minValue * 2);//compiler casts minValue to int, multiplies on 2 
			nBits = nBits + 1;
		}
		long maxValue = (minValue - 1);
		System.out.printf("long. minimal value is %d, maximal value is %d, number of bytes is %d\n", minValue, maxValue, nBits / 8);		
		
	}

	private static void printCharInformation() {
		char minValue = 1; 
		int nBits = 1;
		while(minValue > 0) {
			minValue = (char) (minValue * 2);//compiler casts minValue to int, multiplies on 2 
			nBits = nBits + 1;
		}
		char maxValue = (char) (minValue - 1);
		System.out.printf("char. minimal value is %d, maximal value is %d, number of bytes is %d\n", (int)minValue, (int)maxValue, nBits / 8);		
		
	}
}
