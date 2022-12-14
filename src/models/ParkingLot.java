package models;

import java.util.ArrayList;

import Utils.VehicleTypes;
import controllers.BankSlipHandler;
import controllers.CreditCardHandler;
import controllers.CustomerPayment;
import controllers.DebitCardHandler;
import controllers.NotFoundPaymentHandler;
import controllers.PixHandler;
import models.vehicle.PriceBehaviour;
import models.vehicle.PriceCar;
import models.vehicle.Vehicle;
import models.vehicle.VehicleFactory;

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
  private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); // vehicle update here

  private VehicleFactory factory;

  public static ParkingLot instance;

  protected ParkingLot() {
  }

  public static ParkingLot getInstance() {
    if (instance == null) {
      instance = new ParkingLot();

      return instance;
    }

    return instance;
  }

  public void setAllAtributes(
      String name, String address,
      String zipcode, int vacanciesNumber, String owner) {
    setName(name);
    setAddress(address);
    setZipcode(zipcode);
    setVacanciesNumber(vacanciesNumber);
    setAvailableVacanciesNumber();
    setOwner((owner != null) ? owner : null);
    setEmployeesNumber(this.employees.size());
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String newAddress) {
    this.address = newAddress;
  }

  public String getZipcode() {
    return this.zipcode;
  }

  public void setZipcode(String newZipcode) {
    this.zipcode = newZipcode;
  }

  public int getVacanciesNumber() {
    return this.vacanciesNumber;
  }

  public void setVacanciesNumber(int newVacanciesNumber) {
    this.vacanciesNumber = newVacanciesNumber;
  }

  public int getAvailableVacanciesNumber() {
    return this.availableVacanciesNumber;
  }

  public void setAvailableVacanciesNumber() {
    this.availableVacanciesNumber = getVacanciesNumber();
  }

  public int getEmployeesNumber() {
    return this.totalEmployeesNumber;
  }

  public void setEmployeesNumber(int newEmployeesNumber) {
    this.totalEmployeesNumber = newEmployeesNumber;
  }

  public String getOwner() {
    return this.owner;
  }

  public void setOwner(String newOwner) {
    this.owner = newOwner;
  }

  public void addUser(User user) {
    this.users.add(user);
    // PriceBehaviour priceBehaviour;
    // priceBehaviour = new PriceCar();
    // Vehicle carFactory = CarFactory.addVehicle(5874, this.users.size(), "Null",
    // priceBehaviour);
    this.availableVacanciesNumber--;
  }

  public ArrayList<String> listUsers() {
    if (users.isEmpty()) {
      return null;
    }
    ArrayList<String> toStringUsers = new ArrayList<String>();
    for (User user : this.users) {
      toStringUsers.add(user.getName());
    }
    return toStringUsers;
  }

  public void removeUser(User user) {
    this.users.remove(user);
    this.availableVacanciesNumber++;
  }

  public void addEmployee(User employee) {
    this.employees.add(employee);
  }

  public void removeEmployee(User employee) {
    this.employees.remove(employee);
  }

  public ArrayList<String> listEmployees() {
    if (this.employees.isEmpty()) {
      return null;
    }

    ArrayList<String> toStringEmployees = new ArrayList<String>();
    for (User employee : this.employees) {
      toStringEmployees.add(employee.getName());
    }
    return toStringEmployees;
  }

  public void parkingLotEntry(Vehicle vehicle) {
    vehicles.add(vehicle);
    this.availableVacanciesNumber--;
  }

  public void parkingLotExit(int controlNumber, String methodPayment) {
    CustomerPayment payment = new CustomerPayment(methodPayment);
    PixHandler pixHandler = new PixHandler();
    pixHandler
      .setNextHander(new DebitCardHandler())
      .setNextHander(new CreditCardHandler())
      .setNextHander(new BankSlipHandler())
      .setNextHander(new NotFoundPaymentHandler());

    pixHandler.handle(payment);

    for (Vehicle vehicle : vehicles) {
      if (vehicle.getControlNumber() == controlNumber && payment.acceptPayment) {
        vehicles.remove(vehicle);
        this.availableVacanciesNumber++;
        break;
      }
    }
  }

  public ArrayList<Integer> listVehicles() {
    ArrayList<Integer> controlNumberList = new ArrayList<Integer>();
    for (Vehicle vehicle : vehicles) {
      controlNumberList.add(vehicle.getControlNumber());
    }

    return controlNumberList;
  }
}
