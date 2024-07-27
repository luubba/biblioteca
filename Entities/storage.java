package Entities;
import java.util.ArrayList;
import java.util.List;


public class storage {

  public boolean disponivel;
  public static List <Livro> livros = new ArrayList<>();

  //methods

  public static void addLivro(Livro livro){
    livros.add(livro);
  }

  public void removeLivro(Livro livro){
    livros.remove(livro);
  }

  public void removeLivro(String livro){
    livros.remove(livro);
  }
  
  public static boolean verificarLivro(String livro) {
    return livros.contains(livro);
}

}
