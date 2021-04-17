public class temperature {
    private double Farhenheit;
    private double Celsius;
    private double Kelvin;
    
    public temperature(double Farhenheit, double Celsius, double Kelvin) {
        this.Farhenheit = Farhenheit;
        this.Celsius = Celsius;
        this.Kelvin = Kelvin;
    }
    
    public double setFarhenheit(double F) {
        Farhenheit = F;
        return Farhenheit;
    }
    
    public double getFarhenheit() {
        return Farhenheit;
    }
    
    public double setCelsius(double C) {
        Celsius = C;
        return Celsius;
    }
    
    public double getCelsius() {
        return Celsius;
    }
    
    public double setKelvin(double K) {
        Kelvin = K;
        return Kelvin;
    }
    
    public double getKelvin() {
        return Kelvin;
    }
    
    public double FToC(double F) {
        Celsius = (F - 32) * 5/9;
        return Celsius;
    }
    
    public double CToF(double C) {
        Farhenheit = (C * 9 / 5) + 32;
        return Farhenheit;
    }
    
    public double FToK(double F) {
        Kelvin = (F - 32) * 5 / 9 + 273.15;
        return Kelvin;
    }
    
    public double CToK(double C) {
        Kelvin = C + 273.15;
        return Kelvin;
    }
    
    public void howItFeels(double Celsius) {
        if(Celsius < -30)
            System.out.println("Freezing Cold");
        else if(Celsius < 10 && Celsius > -30) 
            System.out.println("Cold");
        else if(Celsius > 10 && Celsius <= 15)
            System.out.println("Cool");
        else if(Celsius > 15 && Celsius <= 25)
            System.out.println("Warm");
        else if(Celsius > 25 && Celsius <= 30)
            System.out.println("Hot");
        else if(Celsius >= 37 && Celsius <= 40)
            System.out.println("Very Hot");
        else if(Celsius > 40 && Celsius <= 50)
            System.out.println("Extremely Hot");
        else if(Celsius > 50)
            System.out.println("So Hot that nothing lives there.");
    }
}
