import java.util.*;

public abstract class BaseTest implements TypingTester {
    // Shared data for all test types
    protected final long DURATION_MS = 60000;
    protected Set<Integer> completedTests = new HashSet<>();
    protected Map<Integer, String> challengeMap = new HashMap<>();
    
    // Tally for final results
    protected int totalMatches = 0;
    protected int totalPossible = 0;
    protected long totalTimeMillis = 0;

    public BaseTest() {
        challengeMap.put(1, "pegasus highland mountain door buy the tree under sky up the hill and in the well stayed mouse cricket and a brave owl watched");
        
        challengeMap.put(2, "velocity echoes through the canyon as silent shadows dance beneath ancient stone arches while time stands still");
    }
}
