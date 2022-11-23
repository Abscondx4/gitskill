import java.util.ArrayList;

public interface IParams {
    public int getBig();
    public int getMedium();
    public int getSmall();
    public void set(int big,int medium,int small);
    public ArrayList<Integer> getPlanParking();
    public void add(int i);
}