package models;

public class ParkingLot {
  private String name;
  private String address;
  private String zipcode;
  private int vacanciesNumber;
  private User owner;

  public static ParkingLot instance;

  protected ParkingLot() {
  }

  public static ParkingLot getInstance(){
    if(instance == null){
      instance = new ParkingLot();
      
      return instance;      
    }

    return instance;
  }

  public void setAll(
    String name, String address, 
    String zipcode, int vacanciesNumber, User owner
  ){
    setName(name);
    setAddress(address);
    setZipcode(zipcode);
    setVacanciesNumber(vacanciesNumber);
    setOwner((owner != null) ? owner : null);
    
    // this.name = name;
    // this.address = address;
    // this.zipcode = zipcode;
    // this.vacanciesNumber = vacanciesNumber;
    // this.owner = (owner != null) ? owner : null;
  }

  public String getName(){
    return this.name;
  }
  public void setName(String newName){
    this.name = newName;
  }
  public String getAddress(){
    return this.address;
  }
  public void setAddress(String newAddress){
    this.address = newAddress;
  }
  public String getZipcode(){
    return this.zipcode;
  }
  public void setZipcode(String newZipcode){
    this.zipcode = newZipcode;
  }
  public int getVacanciesNumber(){
    return this.vacanciesNumber;
  }
  public void setVacanciesNumber(int newVacanciesNumber){
    this.vacanciesNumber = newVacanciesNumber;
  }
  public User getOwner(){
    return this.owner;
  }
  public void setOwner(User newOwner){
    this.owner = newOwner;
  }
}
