package pl.maniaq;

public class Zadanie3 {

    public static void main(String[] args) {
        // mozna też zainicjalizować przez: int [][] numbers = new int[3][3] - a liczby wstawić przez indeksy
        int [][] numbers = {
                {1, 2, 4},
                {8, 5, 4},
                {9, 12, 5},
        };

        int result = numbers[0][0] + numbers[0][1] +numbers[0][2    ] +numbers[1][0] +numbers[1][1] +numbers[1][2] +numbers[2][0] +numbers[2][1] +numbers[2][2];
        System.out.println("Wynik dodawania liczb: "+result);
    }
}
