package CHAPTER10;

public class Rock {

    int sampleNumber;
    String description;
    double weight;
    
    Rock(int sampleNumber, double weight) {
        this.sampleNumber = sampleNumber;
        this.weight = weight;
        description = "Unclassified";
    }
    
    /**
    * @return the description
    */
    
    public String getDescription() {
        return description;
    }
    
    /**
    * @return the sampleNumber
    */
    
    public int getSampleNumber() {
        return sampleNumber;
    }
    
    /**
    * @return the weight
    */
    
    public double getWeight() {
        return weight;
    }
    
    /**
    * @param description the description to set
    */
    
    public void setDescription(String description) { 
        this.description = description;
    }
}
    