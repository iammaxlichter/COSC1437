package CHAPTER3;

class Sandwich{

    private String MainIngredient;
    private String Bread;
    private Double Price;
    
    Sandwich(){
    }
    
    Sandwich(String m_ing, String bread, Double price){
    
    MainIngredient = m_ing;
    Bread = bread;
    Price = price;
    }
    
    public String getMainIngredient() {
        return MainIngredient;
    }
    
    
    public String getBread() {
        return Bread;
    }
    
    public Double getPrice() {
        return Price;
    }
    
    public void setMainIngredient(String mainIngredient) {
        MainIngredient = mainIngredient;
    }
    
    public void setBread(String bread) {
        Bread = bread;
    }
    
    public void setPrice(Double price) {
        Price = price;
    }
    
}
    
