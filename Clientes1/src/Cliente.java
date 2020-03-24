
public class Cliente {
    private int codigo;
    private String nombre;
    
    public int getCodigo(){
    return codigo;
    }
    
    public void setCodigo(int codigo){
    this.codigo=codigo;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public Cliente(){
    
    }
    
    public Cliente(int codigo,String nombre){
    
    this.codigo=codigo;
    this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    

}
