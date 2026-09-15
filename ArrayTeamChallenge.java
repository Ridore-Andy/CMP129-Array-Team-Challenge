import java.util.Scanner;
public class ArrayTeamChallenge {

    public static void main(String[] args) {

        int[] scores = {78, 92, 85, 67, 95, 88, 73, 90};

        // Challenge 1:
        // Display every score in the array using a loop.
        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i] + " ");
        }

        // Challenge 2:
        // Calculate and display the average score.
        // Your solution should still work if more scores are added.
        int scoreSum = 0;
        for (int i= 0; i < scores.length; i++) {
            scoreSum += scores[i];
        }
        double scoreAvg = scoreSum / scores.length;
        System.out.print(scoreAvg);
        
        // Challenge 3:
        // Find and display the highest and lowest score in the array.
        // Do not simply print 95.
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) { 
            if (scores[i] > highest) {
                highest = scores[i];
            }
            
            if (scores[i]<lowest){
                lowest = scores[i];
            }
            
        }


        // Challenge 4:
        // Count and display how many scores are above the average.
        int aboveAvg = 0;
        for(int i=0; i<scores.length; i++)
        {
            if(scores[i]>scoreAvg)
                aboveAvg=aboveAvg + 1;
        }
        System.out.print("Students above average: "+aboveAvg);


        // BONUS 1 - REVERSE ORDER:
        // Display the scores in reverse order.
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }
        

        // BONUS 2 - SCORE SEARCH:
        // Ask the user to enter a score to search for.
        // Determine whether the score exists in the array.
        // Display the index of the first occurrence.
        // Count how many times the score appears.
        // If it is not found, display an appropriate message.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score to search for: ");
        int searchscore = input.nextInt();
        
        int count = 0;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] == searchscore){
                System.out.println("Score found at index: " + i);
                count++;
            }
            if (count == 0){
                System.out.println("Score not found.");
            }    
            if (count > 0){
                System.out.println("Score appears " + count + " times.");
            }

            
        }

    }
}
