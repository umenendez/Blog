package ed_proyecto_blog_Unax_Menendez;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public Post getPost(int index) {
        if (index >= 0 && index < posts.size()) {
            return posts.get(index);
        }
        return null;
    }

    public void removePost(int index) {
        if (index >= 0 && index < posts.size()) {
            posts.remove(index);
        }
    }
}
