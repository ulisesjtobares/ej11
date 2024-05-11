import java.time.LocalDate;
import java.io.*;

public class Perro{
  private String nombre;
  private long dniPropietario;
  private LocalDate FechaNacimiento;
  private String raza;
  private String codigo;
  private boolean esAlta;

  public Perro(){
    esAlta=true;
    asigna();
  }

  public void asigna(){
    BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
    try{
      System.out.print("\nNombre del perro: ");
      nombre = entrada.readLine();
      System.out.print("\nDNI del propietario: ");
      dniPropietario = Long.parseLong(entrada.readLine());
      while(Long.toString(dniPropietario).length()<8){
        System.out.print("\nError al ingresar el dni ");
        System.out.print("\nDNI del propietario: ");
        dniPropietario = Long.parseLong(entrada.readLine());
      }
      System.out.print("\nFecha de Nacimiento(AAAA-MM-DD): ");
      FechaNacimiento = LocalDate.parse(entrada.readLine());
      System.out.print("\nRaza: ");
      raza = entrada.readLine();
      System.out.print("\nCodigo (5 caracteres): ");
      codigo = entrada.readLine();
      while(codigo.length()>5 || codigo.length()==0){
        System.out.print("\nError al ingresar el codigo");
        System.out.print("\nCodigo (5 caracteres): ");
        codigo = entrada.readLine();
      }  
       }catch (IOException e){
         System.out.println("Excepcion en la entrada de datos " + e.getMessage()+ " . No se da de alta");
         esAlta = false;
        }
  }

  public boolean esAlta(){
    return this.esAlta;
  }

  public void setAlta(boolean esAlta){
    this.esAlta = esAlta;
  }

  public String getCodigo(){
    return this.codigo;
  }

  public String Mostrar(){
    return "\nNombre: " + nombre + 
            "\nDNI Propietario: " + dniPropietario + "\nNacimiento: " + FechaNacimiento +
            "\nRaza: " + raza +
            "\nCodigo: " + codigo;
  }

}