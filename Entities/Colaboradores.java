package Entities;

import java.util.ArrayList;
import java.util.List;

public class Colaboradores {
	
  private String name;
  List <Colaboradores> colaborador = new ArrayList<>();
  

  //contructors
  public Colaboradores (){

  }

  public Colaboradores (String name){

    this.name = name;
  }


  //getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //methods

  public void addColaborador(Colaboradores colaboradores){
    colaborador.add(colaboradores);
  }
  
  

  


}
