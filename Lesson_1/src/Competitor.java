public interface Competitor {
    void run(int distance);
    void swim(int distance);
    void jump(int height);
    String getType();
    String getName();
    boolean isOnDistance();
    String showResult();
}