import java.util.Scanner;

/**
 * 26. Tvoří zadaná matice magický čtverec?
 * @author Ondřej Veselý
 * @version 20.12 / 2022
 */

  //menu, kde uživatel vybere jakou úlohu spustit
public class MagicSquare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Vyberte úlohu:");
      System.out.println("1. MagicSquare");
      System.out.println("2. Vánoční Úloha");
      System.out.println("3. Exit");

      String choice = scanner.nextLine();

      if (choice.equals("1")) {
        runMagicSquare();
      } else if (choice.equals("2")) {
        // OndrejVesely.java je název vánoční úlohy
        OndrejVesely.main(null);
      } else if (choice.equals("3")) {
        // Ukončit program
        break;
      } else {
        System.out.println("Neplatná volba. Zkuste to znovu.");
      }
    }

    scanner.close();
  }
  
  //samotný program pro určení magického trojúhelníku
  private static void runMagicSquare() {
	  
    Scanner input = new Scanner(System.in);
    
    while (true) {
    
    System.out.print("Zadejte rozměr matice (0 a -1 pro ukončení programu): ");
    int size = input.nextInt();
    
    
    // Jetli je velikost matice 0, nebo -1, ukonči program.
    if (size < -2 || size == -2) {
    	System.out.println("Neplatná volba pro matici.");
    	return;
    	
    	
    }
    if (size == 0 || size == -1) {
      System.out.println("Program ukončen.");
      break;
      
      
    }

    System.out.println("Zadejte matici:");
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        matrix[i][j] = input.nextInt();
      }
    }

    //Pokud je isMagicSquare pravda, matice je magický čtverec
    if (isMagicSquare(matrix)) {
      System.out.println("Matice tvoří magický čtverec.");
    } else {
      System.out.println("Nejedná se o magický čtverec.");
    }
    }
  }
  
  /**isMagicSquare otestuje zda je každá následující podmínka pro magický čtverec splněna:
   * 
   * a) matice není null a není prázdná
   * b) součet prvků v každém řádku, sloupci a diagonále je stejný
   * 
   */
  public static boolean isMagicSquare(int[][] matrix) {
    // Zkontroluj zda je matice je null nebo prázdná
    if (matrix == null || matrix.length == 0) {
      return false;
    }

    int size = matrix.length;

  // Zkontroluj jestli součet prvků v každém řádku, sloupci a diagonále je stejný
  int sum = 0;
  for (int i = 0; i < size; i++) {
    sum += matrix[0][i];
  }
  for (int i = 0; i < size; i++) {
    int rowSum = 0;
    for (int j = 0; j < size; j++) {
      rowSum += matrix[i][j];
    }
    if (rowSum != sum) {
      return false;
    }
  }
  for (int i = 0; i < size; i++) {
    int colSum = 0;
    for (int j = 0; j < size; j++) {
      colSum += matrix[j][i];
    }
    if (colSum != sum) {
      return false;
    }
  }
  int diagonalSum1 = 0;
  for (int i = 0; i < size; i++) {
    diagonalSum1 += matrix[i][i];
  }
  if (diagonalSum1 != sum) {
    return false;
  }
  int diagonalSum2 = 0;
  for (int i = 0; i < size; i++) {
    diagonalSum2 += matrix[i][size - i - 1];
  }
  if (diagonalSum2 != sum) {
    return false;
  }

  // Jestli všechny podmínky jsou splněny, matice je magický čtverec
  return true;
}
  
}

