public class Caballo{
  
String nombre;
String raza;
String color;
int    peso;
Caballo ( String n ,String r, String c , int p){
  this.nombre = n;
  this.raza = r;
  this.color = c;
  this.peso = p;
}

public String getNombre(){
return this.nombre;
}
public String getRaza(){
return this.raza;
}

public void Reincha(){
  System.out.println("Hiiii");
}


}
