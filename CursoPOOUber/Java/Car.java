class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passengenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        if(passengenger != null){
            System.out.println("Licese: " + license + " Name Driver: " + driver.name + "passengengers: " + passengenger);
        }
    }

    public Integer getPassenger(){
        return passengenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passengenger = passenger;
        }else{
            System.out.println("necesitas asignar 4 pasajeros");
        }
    }
        /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the driver
     */
    public Account getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Account driver) {
        this.driver = driver;
    }
}
