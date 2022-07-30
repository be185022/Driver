public class Dog {

    public Dog(String name, String breed, String gender, String age, String weight, String acquisitionDate,
            String acquisitionLocation, String trainingStatus, boolean isReserved, String serviceLocation) {
                this.name = name;
                this.breed = breed;
                this.gender = gender;
                this.age = age;
                this.weight = weight;
                this.acquisitionDate = acquisitionDate;
                this.acquisitionLocation = acquisitionLocation;
                this.trainingStatus = trainingStatus;
                this.isReserved = isReserved;
                this.serviceLocation = serviceLocation;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return breed;
    }

    public String getInServiceLocation() {
        return serviceLocation;
    }

    public void setReserved(boolean b) {
        isReserved = b;
    }

    public String getTrainingStatus() {
        return trainingStatus;
    }

    public boolean getReserved() {
        return isReserved;
    }

    public String toString() {
        return "Name: " + name + ", Status: " + trainingStatus + ", Acquisition Location: " + acquisitionLocation;
    }

    private String name;
    private String breed;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionLocation;
    private String trainingStatus;
    private boolean isReserved;
    private String serviceLocation;

}
