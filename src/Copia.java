public class Copia extends java.lang.Object
{
    int id;
    Livro livro1;

    public Copia(int id, Livro livro) {
        this.id = id;
        this.livro1 = livro;
    }

    public int getId() {
        return this.id;
    }

    public Livro getLivro() {
        return this.livro1;
    }

}

