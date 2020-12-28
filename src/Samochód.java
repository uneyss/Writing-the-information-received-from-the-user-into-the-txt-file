public class Samochód {
    private String model;
    private String marka;
    private String silnik;

    public Samochód(){
       
    }
    public String getModel() {
        return model;
    }

    
    public void setModel(String model) {
        this.model = model;
    }

    
    public String getMarka() {
        return marka;
    }

    
    public void setMarka(String marka) {
        this.marka = marka;
    }

    
    public String getSilnik() {
        return silnik;
    }

    
    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }

    @Override
    public String toString() {
        return(this.marka +" " + this.model+ " " + this.silnik); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
   
    
}
