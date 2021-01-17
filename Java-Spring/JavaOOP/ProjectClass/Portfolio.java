import java.util.ArrayList;

public class Portfolio{
    private ArrayList <Project> projectList = new ArrayList<Project>();

    public Portfolio(){

    }
    public ArrayList <Project> getProjectList(){
        return this .projectList;
    }
    public void setProjectList(Project newProject){
        this.projectList.add(newProject);
    }
    public double getPortfolioCost(){
        double sum = 0.0;
        for (int i = 0; i < this.projectList.size(); i++) {
            sum+= this.projectList.get(i).getInitialCost();
        }
        return sum;
    }
    public void showPortfolio(){
        for(Project i: this.projectList){
            System.out.println(i.elevatorPitch());
        }
        System.out.println(this.getPortfolioCost());
    }
}