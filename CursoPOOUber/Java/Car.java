class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("Licese: " + license + " Name Driver: " + driver.name);
    }
}