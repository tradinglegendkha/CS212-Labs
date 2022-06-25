package Day8;

public class Wallet {
    private double penny, nickel, dime, quarter;
    private double dollar, five, ten, twenty, fifty, oneHundred;
    public static void main(String[] args) {
        Wallet wa = new Wallet();
                   
    }
    //default constructor
    public Wallet() {
        setPenny(0.01);
        setNickel(0.05);
        setDime(0.10);
        setQuarter(0.25);
        setDollar(1.00);
        setfive(5.00);
        setTen(10.00);
        setTwenty(20.00);
        setFifty(50.00);
        setOneHundred(100.00);
    }
    
    //addMoney function
    public static double addMoney(double n1, double n2) {
        return n1+n2; 
    }
    //spendMoney function
    public double spendMoney() {
        return spendMoney();
    }

    //setters and getters
    public double getPenny() {
        return penny;
    }
    public void setPenny(double penny) {
        this.penny = penny;
    }
    public double getNickel() {
        return nickel;
    }
    public void setNickel(double nickel) {
        this.nickel = nickel;
    }
    public double getDime() {
        return dime;
    }
    public void setDime(double dime) {
        this.dime = dime;
    }
    public double getQuater() {
        return quarter;
    }
    public void setQuarter(double quarter) {
        this.quarter = quarter;
    }
    public double getDollar() {
        return dollar;
    }
    public void setDollar(double dollar) {
        this.dollar = dollar;
    }
    public double getFive() {
        return five;
    }
    public void setfive(double five) {
        this.five = five;
    }
    public double getTen() {
        return ten;
    }
    public void setTen(double ten) {
        this.ten = ten;
    }
    public double getTwenty() {
        return twenty;
    }
    public void setTwenty(double twenty) {
        this.twenty = twenty;
    }
    public double getFifty() {
        return fifty;
    }
    public void setFifty(double fifty) {
        this.fifty = fifty;
    }
    public double getOneHundred() {
        return oneHundred;
    }
    public void setOneHundred(double oneHundred) {
        this.oneHundred = oneHundred;
    }
    /*
    //toString
    public String toString() {
        
    }*/
}
