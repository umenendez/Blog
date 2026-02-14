package ed_proyecto_blog_Unax_Menendez;

public class Post {

    private int id;
    private String title;
    private String content;

    public Post(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public void showPost() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + title);
        System.out.println("Contenido: " + content);
    }

    @Override
    public String toString() {
        return "Post [id=" + id + ", title=" + title + "]";
    }
}
