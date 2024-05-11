class Main {
  public static void main(String[] args) {
    
    System.out.println("Ejercicio Tabla Dispersa");

    
    TablaDispersa pedigree = new TablaDispersa();
    
    Perro perro1 = new Perro();
    Perro perro2 = new Perro();
    Perro perro3 = new Perro();
    
    System.out.println(perro1.Mostrar());
    System.out.println(perro1.Mostrar());
    System.out.println(perro1.Mostrar());

    int contador= 0;
    while(contador<20){

      pedigree.insertar(perro1);
      pedigree.insertar(perro2);
      pedigree.insertar(perro3);

      System.out.println(pedigree.buscar("abcde").Mostrar());
      contador++;
    }


  }
}