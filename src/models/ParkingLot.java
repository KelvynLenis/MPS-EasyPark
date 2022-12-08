package models;

import java.util.ArrayList;

public class ParkingLot {
  private String name;
  private String address;
  private String zipcode;
  private int vacanciesNumber;
  private int availableVacanciesNumber;
  private String owner;
  private int totalEmployeesNumber;
  private ArrayList<User> users = new ArrayList<User>();
  private ArrayList<User> employees = new ArrayList<User>();
  // private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); // vehicle update here

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

  public void setAllAtributes(
    String name, String address, 
    String zipcode, int vacanciesNumber, String owner
  ){
    setName(name);
    setAddress(address);
    setZipcode(zipcode);
    setVacanciesNumber(vacanciesNumber);
    setAvailableVacanciesNumber();
    setOwner((owner != null) ? owner : null);
    setEmployeesNumber(this.employees.size());
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
  public int getAvailableVacanciesNumber(){
    return this.availableVacanciesNumber;
  }
  public void setAvailableVacanciesNumber(){
    this.availableVacanciesNumber = getVacanciesNumber();
  }
  public int getEmployeesNumber() {
    return this.totalEmployeesNumber;
  }
  public void setEmployeesNumber(int newEmployeesNumber){
    this.totalEmployeesNumber = newEmployeesNumber;
  }
  public String getOwner(){
    return this.owner;
  }
  public void setOwner(String newOwner){
    this.owner = newOwner;
  }

  public void addUser(User user){
    this.users.add(user);
    this.availableVacanciesNumber--;
  }

  public ArrayList<String> listUsers(){
    if(users.isEmpty()){
      return null;
    }
    ArrayList<String> toStringUsers = new ArrayList<String>();
    for (User user : this.users) {
      toStringUsers.add(user.getName());
    }
    return toStringUsers;
  }

  public void removeUser(User user){
    this.users.remove(user);
    this.availableVacanciesNumber++;
  }

  public void addEmployee(User employee){
    this.employees.add(employee);
  }

  public void removeEmployee(User employee){
    this.employees.remove(employee);
  }

  public ArrayList<String> listEmployees(){
    if(this.employees.isEmpty()){
      return null;
    }

    ArrayList<String> toStringEmployees = new ArrayList<String>();
    for (User employee : this.employees) {
      toStringEmployees.add(employee.getName());
    }
    return toStringEmployees;
  }

  public void parkingLotEntry(String controlCode, int vehicleCategory, String furtherServices){
    // vehicle todo
  }

  public void parkingLotExit(String controlCode){
    // vehicle todo
  }
}
