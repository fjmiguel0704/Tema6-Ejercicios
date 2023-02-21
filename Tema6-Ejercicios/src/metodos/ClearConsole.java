package metodos;

public class ClearConsole {
	public static void clearConsole(String line) {
		for (int i = 1; i <= line.length(); i++) {
			System.out.print("\b \b");
		}
	}
}
