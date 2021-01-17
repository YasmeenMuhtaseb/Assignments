public class ProjectTest{
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Company");
        Project project3 = new Project("Company1","this is yasmeen's company",500);
        Project project4 = new Project("Company2","this is yasmeen's company",500);
        Project project5 = new Project("Company3","this is yasmeen's company",500);
        
        //project3.setName("company3");
        // System.out.println(project3.elevatorPitch());
        // System.out.println(project2.getName());
        // System.out.println(project1.getName());

        Portfolio portfolio1 = new Portfolio();
        portfolio1.setProjectList(project3);
        portfolio1.setProjectList(project4);
        portfolio1.setProjectList(project5);

        System.out.println(portfolio1.getPortfolioCost());
        portfolio1.showPortfolio();



    }
}