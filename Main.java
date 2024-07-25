import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in); 
        int [][] seats = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        }; 

        int row, col; 
        int choice; 
        int restart; 

        while(true) {
            System.out.println("--------------------------------------------------");
            System.out.println("Check you seat vacancy here. ");

            for (int i=0; i<5; i++) {
                for (int j=0; j<5; j++) {
                    System.out.print(seats[i][j] + " " );
                }
                System.out.print("\n");
            }

            System.out.println("\n\n");

            while(true) {
                System.out.println("Enter row number : ");
                row = Input.nextInt(); 

                if (row < 0 || row >= 5) {
                    System.out.println("Invalid row number. Please try again. ");
                    continue; 
                }
                else {
                    break;
                }
            }

            while (true) {
                System.out.println("Enter column number : "); 
                col = Input.nextInt(); 

                if (col < 0 || col >= 5) {
                    System.out.println("Invalid column number. Please try again. ");
                    continue; 
                }
                else {
                    break; 
                }
            }

            System.out.println("==================================================");

            for(int i=0; i<5; i++) {
                for(int j=0; j<5; j++) {
                    System.out.print(seats[i][j] + " "); 
                }
                System.out.print("\n"); 
            }

            if (seats[row][col] == 0) {
                System.out.println("\n\nAvailable");
                
                System.out.println("\n\nBook this seat ? (enter \'1\' to book seat and any number to deny)"); 
                choice = Input.nextInt(); 

                if (choice == 1) {
                    seats[row][col] = 1;
                    System.out.println("Seat booked\n\n"); 
                }
                else {
                    break; 
                }
            }
            else {
                System.out.println("\n\nOccupied\n\n"); 
                System.out.println("Restart ? ( type 1 to restart, any number to deny)"); 
                restart = Input.nextInt(); 

                if (restart != 1) {
                    break; 
                }
            }

        }
    }
}