package CHAPTER3;

public class Lease {

    private String name ;
    private int aptNumber ;
    private double rent ;
    private int term ;
    
        public Lease() {
            this.name = "XXX" ;
            this.aptNumber = 0 ;
            this.rent = 1000 ;
            this.term = 12 ;
        }
    
        public Lease(String name, int aptNumber, double rent, int term) {
            super();
    
            this.name = name;
            this.aptNumber = aptNumber;
            this.rent = rent;
            this.term = term;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getAptNumber() {
            return aptNumber;
        }
    
        public void setAptNumber(int aptNumber) {
            this.aptNumber = aptNumber;
        }
    
        public double getRent() {
            return rent;
        }
    
        public void setRent(double rent) {
            this.rent = rent;
        }
    
        public int getTerm() {
             return term;
        }
    
        public void setTerm(int term) {
            this.term = term;
        }
    
        public void addPetFee() {
            this.rent += 10 ;
            Lease.explainPetPolicy();
        }
    
        public static void explainPetPolicy() {
            System.out.println("A pet fee of $10 is added to the monthly rent.");
        }
    }
    