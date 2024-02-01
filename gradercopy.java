
class Grader{
    String name ;
    String desc;
    int []pts;
    String []sols;  
    public Grader(String ques, String sent, int []points,String []solution){
        this.name = ques;
        this.desc= sent;
        this.pts= java.util.Arrays.copyOf(points, points.length);
        this.sols= java.util.Arrays.copyOf(solution, solution.length);
    } 

}
public class gradercopy {
    
}