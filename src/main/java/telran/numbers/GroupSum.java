package telran.numbers;

public abstract class GroupSum {
    int[][] groups;

    public GroupSum(int[][] groups) {
        this.groups = groups;
    }
    public abstract long computeSum();
}