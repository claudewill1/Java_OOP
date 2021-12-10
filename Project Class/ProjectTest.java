public class ProjectTest {
    public static void main(String[] args) {
        Project proj = new Project("eCommerce Web App","eCommerce Web App created using the MVC design patter.",2600.00);
        Project proj2 = new Project();
        proj2.setName("Mobile App");
        proj2.setDescription("A description of this project");
        proj2.setInitialCost(5000.00);
        proj.elevatorPitch(proj.getName(),proj.getInitialCost(),proj.getDescription());
        proj2.elevatorPitch(proj2.getName(),proj2.getInitialCost(),proj2.getDescription());
        


    }
}
