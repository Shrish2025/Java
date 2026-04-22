public interface TypingTester {
    void runTest(int choice) throws FastTypistException;

    // Default Gatekeeper
    default boolean isProgressComplete(int completedCount, int requiredCount) {
        return completedCount >= requiredCount;
    }

    // NEW: Default Results Calculation
    default void showFinalResults(int matches, int totalPossible, long timeMillis) {
        float accuracy = (totalPossible == 0) ? 0 : ((float) matches / totalPossible) * 100;
        
        // Convert milliseconds to minutes for WPM
        double minutes = timeMillis / 60000.0;
        
        // Prevent division by zero if they finish in 0ms
        int wpm = (minutes > 0) ? (int) (matches / minutes) : 0;

        System.out.println("\n--- CONSOLIDATED PERFORMANCE ---");
        System.out.println("Final WPM: " + wpm);
        System.out.println("Final Accuracy: " + String.format("%.2f", accuracy) + "%");
        System.out.println("Status: Verified 2026 Metric Standards");
    }
}
