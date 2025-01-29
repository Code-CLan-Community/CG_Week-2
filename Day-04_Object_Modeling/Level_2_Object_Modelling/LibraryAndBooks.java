// Importing ArrayList class
import java.util.ArrayList;

// Creating Publication class to store and display Publication details
class Publication
{
    // Creating attribute of the publication class
    String pubTitle;
	String pubAuthor;
	
	// Creating Constructor of the class
	Publication(String pubTitle, String pubAuthor)
	{
	   this.pubTitle = pubTitle;
	   this.pubAuthor = pubAuthor;
	}
	
	// Method to display Publication details
	public void showPublicationDetails()
	{
	   System.out.println("Title of the publication is " + pubTitle);
	   System.out.println("Author of the publication is " + pubAuthor);
	}
}

// Creating Repository class to store list of publications
class Repository 
{
    ArrayList<Publication> publications;
    
	// Creating Constructor of the class
    Repository() 
	{
        this.publications = new ArrayList<>();
    }
    
	// Method to add list of publications
    void addPublication(Publication publication) 
	{
        this.publications.add(publication);
    }
}

// Creating Main class
class RepositoryAndPublications
{
   // Creating main method
   public static void main(String[] args)
   {
        // Creating object of Publication class
        Publication pub1 = new Publication("Java", "James Gosling");
		Publication pub2 = new Publication("C++", "Bjarne Stroustrup");
		Publication pub3 = new Publication("C", "Dennis Ritchie");
		
		// Creating object of Repository class
		Repository repo1 = new Repository();
		Repository repo2 = new Repository();
		
		// Adding publications to the repositories
		repo1.addPublication(pub1);
		repo2.addPublication(pub2);
		repo2.addPublication(pub3);
		
		
		// Displaying publications present in repositories
		System.out.println("Repository1 publications ");
        for (Publication publication : repo1.publications) 
		{
            System.out.println(publication.pubTitle + " by " + publication.pubAuthor);
        }

        System.out.println("\nRepository2 publications");
        for (Publication publication : repo2.publications) 
		{
            System.out.println(publication.pubTitle + " by " + publication.pubAuthor);
        }
   }
}
