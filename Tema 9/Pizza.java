public class Pizza{
  
  int pizzaServida = 0;
  int pizzaPedida = 0;

  String tamano;
  String tipo;
  String estado;
  
  public Pizza( String tamano , String tipo){
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
    pizzaPedida++;
  }
  
  public String toString(){
    return "pizza" + this.tamano + " " + this.tipo + " " + this.estado;
  }
  
  public int pizzaPedida(){
    return pizzaPedida;
  }
  
  public int pizzaServida(){
    return pizzaServida;
  }
  
  
}
