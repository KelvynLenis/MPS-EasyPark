package models;


public class User {
  private String name;
  private String type;
  private String email;
  private String cpf;
  private String password;

  public User(String name, String password, String type){
    this.name = name;
    this.type = type;
    this.password = password;
  }

  public String getName(){
    return this.name;
  }

  public String getType(){
    return this.type;
  }

  public void setEmail(String email){
    this.email = email;
  }
  
  public String getEmail(){
    return this.email;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getCpf(){
    return this.cpf;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setPassword(String password){
    if(!this.password.equals(password)){
      this.password = password;
    }
  }

  public void resetPassword(String password) {
    this.password = password;
  }

  public void setCar() {
    // this.car = car;
  }

  public void getCar() {
    // System.out.println("Car: " + this.car);
  }
}
