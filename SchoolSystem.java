import java.util.ArrayList;

public class SchoolSystem implements ISignup {
    int Big,Medium,Small;
    public static void main(String[] args) throws Exception{
        IParams params =ISignup.parse();
        SchoolSystem ps= new SchoolSystem(params.getBig(), params.getMedium(), params.getSmall());
        ArrayList<Integer> plan=params.getPlanParking();
        for (Integer integer : plan) {
            if (ps.addStudent(integer)) {
                text.append(",true");
            } else {
                text.append(",false");
            }
        }
        text.append("]");
        ps.print();

    }
    SchoolSystem(int Big,int Medium,int Small){
        this.Big=Big;
        this.Medium=Medium;
        this.Small=Small;
    }
    static StringBuffer text=new StringBuffer("[null");
    public boolean addStudent(int stuType) {
        switch (stuType){
            case 1:
                if(this.Big>0){
                    this.Big--;
                    return true;
                }
                break;

            case 2:
                if(this.Medium>0){
                    this.Medium--;
                    return true;
                }
                break;

            case 3:
                if(this.Small>0){
                    this.Small--;
                    return true;
                }
                break;

            default:
                return  false;
        }
        return false;
    }
    public void print() {
        System.out.println(text);
    }
}
