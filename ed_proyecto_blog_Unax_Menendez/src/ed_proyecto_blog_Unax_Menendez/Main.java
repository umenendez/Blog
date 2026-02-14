package ed_proyecto_blog_Unax_Menendez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Blog blog = new Blog();
        Scanner sc = new Scanner(System.in);

        int option = -1;

        while (option != 0) {

            System.out.println("------ BLOG MENU ------");
            System.out.println("1. Add Post");
            System.out.println("2. Get Post");
            System.out.println("3. Remove Post");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            option = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (option) {

                case 1:
                    // ADD POST
                    System.out.print("Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Content: ");
                    String content = sc.nextLine();

                    Post post = new Post(id, title, content);
                    blog.addPost(post);

                    System.out.println("Post added successfully");
                    break;

                case 2:
                    // GET POST
                    System.out.print("Index: ");
                    int indexGet = sc.nextInt();

                    Post postGet = blog.getPost(indexGet);
                    if (postGet != null) {
                        postGet.showPost();
                    } else {
                        System.out.println("Post not found");
                    }
                    break;

                case 3:
                    // REMOVE POST
                    System.out.print("Index: ");
                    int indexRemove = sc.nextInt();

                    Post postRemove = blog.getPost(indexRemove);
                    if (postRemove != null) {
                        blog.removePost(indexRemove);
                        System.out.println("Post removed");
                    } else {
                        System.out.println("Post not found");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }

            System.out.println();
        }

        sc.close();
    }
}
