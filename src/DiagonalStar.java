public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(13);
    }

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                if (number - i == number || number - i == 1) {
                    for (int j = 0; j < number; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = 0; j < number; j++) {
                        if (number - j == number || number - j == 1) {
                            System.out.print("*");
                        } else if (i + j == i * 2 || i + j == number - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }

                System.out.println("");
            }
        }


    }
}
