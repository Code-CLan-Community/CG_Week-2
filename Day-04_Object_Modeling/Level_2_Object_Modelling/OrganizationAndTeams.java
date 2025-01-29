// Importing ArrayList class
import java.util.ArrayList;

// Creating Worker class to store worker details
class Worker 
{
    // Creating attributes of the Worker class
    String workerName;
    int workerId;

    // Creating Constructor of the class
    Worker(String workerName, int workerId) 
	{
        this.workerName = workerName;
        this.workerId = workerId;
    }

    // Method to display worker details
    public void showWorkerDetails() 
	{
        System.out.println("Worker ID is " + workerId);
		System.out.println("Worker name is " + workerName);
    }
}

// Creating Team class to store Worker details
class Team 
{
    // Creating attribute to store list of workers in a team
    String teamName;
    ArrayList<Worker> workers;

    // Creating Constructor of the class
    Team(String teamName) 
	{
        this.teamName = teamName;
        this.workers = new ArrayList<>();
    }

    // Method to add a worker to the team
    public void addWorker(Worker worker) 
	{
        workers.add(worker);
    }

    // Method to display team and worker details
    public void showTeamDetails() 
	{
        System.out.println("Team name is " + teamName);
        for (Worker worker : workers) 
		{
            worker.showWorkerDetails();
        }
    }
}

// Creating Organization class to store Team details
class Organization 
{
    // Creating attribute to store list of teams in the organization
    String organizationName;
    ArrayList<Team> teams;

    // Creating Constructor of the class
    Organization(String organizationName) 
	{
        this.organizationName = organizationName;
        this.teams = new ArrayList<>();
    }

    // Method to add a team to the organization
    public void addTeam(Team team) 
	{
        teams.add(team);
    }

    // Method to display organization, team, and worker details
    public void showOrganizationDetails() 
	{
        System.out.println("Organization name is " + organizationName);
        for (Team team : teams) 
		{
            team.showTeamDetails();
        }
    }

    // Method to delete organization and all associated teams and workers
    public void removeOrganization() 
	{
        teams.clear();
        System.out.println("Organization and all associated teams and workers have been deleted.");
    }
}

// Creating Main class
class OrganizationAndTeams 
{
    // Creating main method
    public static void main(String[] args) 
	{
        // Creating object of Organization class
        Organization organization = new Organization("Capgemini");

        // Creating team objects
        Team team1 = new Team("Development");
        Team team2 = new Team("HR");

        // Creating worker objects
        Worker worker1 = new Worker("Rajan", 001);
        Worker worker2 = new Worker("Sachin", 002);
        Worker worker3 = new Worker("Abhishek", 003);

        // Adding workers to teams
        team1.addWorker(worker1);
        team1.addWorker(worker2);
        team2.addWorker(worker3);

        // Adding teams to the organization
        organization.addTeam(team1);
        organization.addTeam(team2);

        // Displaying organization details
        organization.showOrganizationDetails();

        // Deleting the organization and associated teams and workers
        organization.removeOrganization();
    }
}
