class Car extends Vehicle{
    private String Model = "Mustang";
    public static void main(String[] args){
        Car mycar = new Car();
        mycar.horn();
        System.out.println(mycar.brandName + " "+ mycar.Model);
    }
}