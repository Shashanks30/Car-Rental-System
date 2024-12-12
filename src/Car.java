public class Car {
    private String carId;
    private String brand;
    private String model;
    private double basepricePerDay;
    private boolean isAvailable;
    public Car(String carId,String brand,String model,double basepricePerDay){
         this.carId=carId;
         this.brand=brand;
         this.model=model;
         this.basepricePerDay=basepricePerDay;
         this.isAvailable=true;
    }
    public String getCarId(){
        return carId;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double calculatePrice(int rentalDay){
        return basepricePerDay*rentalDay;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void rent(){
        isAvailable=false;
    }
    public void returnCar(){
        isAvailable=true;
    }

}
