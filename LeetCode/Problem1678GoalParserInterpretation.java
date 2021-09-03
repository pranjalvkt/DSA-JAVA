package LeetCode;

public class Problem1678GoalParserInterpretation {
    public String interpret(String command) {
        return (command.replace("()", "o")).replace("(al)", "al");
    }
}
