import java.util.Scanner;

public class SpeedCheck extends BaseTest {

    public SpeedCheck() {
        super();
    }

    @Override
    public void runTest(int choice) throws FastTypistException {
        // 1. Validation check
        if (!challengeMap.containsKey(choice)) {
            System.out.println("Invalid choice. Pick 1 or 2.");
            return;
        }

        // 2. Setup challenge and timing
        String challenge = challengeMap.get(choice);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n--- TEST START ---");
        System.out.println("TYPE THIS: " + challenge);
        
        long startTime = System.currentTimeMillis();
        String input = sc.nextLine().toLowerCase(); // Enforcing lowercase
        long finalTime = System.currentTimeMillis() - startTime;

        // 3. Logic: Accumulate total time spent across sessions
        this.totalTimeMillis += finalTime;

        // 4. Logic: Count exact word matches
        String[] words = challenge.split("\\s+");
        String[] typed = input.split("\\s+");
        int matches = 0;
        
        for (int i = 0; i < Math.min(words.length, typed.length); i++) {
            if (words[i].equals(typed[i])) {
                matches++;
            }
        }

        // 5. Update BaseTest state (The "Memory")
        this.totalMatches += matches;
        this.totalPossible += words.length;
        this.completedTests.add(choice);

        // 6. Use Interface Default Methods for Flow Control and Calculation
        // isProgressComplete and showFinalResults are now handled by TypingTester
        if (isProgressComplete(completedTests.size(), 2)) {
            showFinalResults(totalMatches, totalPossible, totalTimeMillis);
        } else {
            System.out.println("\n[✔] String " + choice + " recorded.");
            System.out.println("Wait! You still need to finish the other string to see results.");
        }

        // 7. Exceptional case handling
        if (finalTime < 5000 && input.length() > 10) { 
            throw new FastTypistException("Suspicious speed detected! Time taken: " + (finalTime/1000.0) + "s");
        }
    }
}
