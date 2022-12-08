package Utils;

public class Conversor {
  public Conversor(){}

  public String typeCodeToString(int code){
    String typeToString = null;
    
    switch (code) {
      case 1:
        typeToString = "Cliente";
        return typeToString;
      case 2:
        typeToString = "Funcionário";
        return typeToString;
      case 3:
        typeToString = "Administrador";
        return typeToString;
    
      default:
        break;
    }

    return null;
  }
}
