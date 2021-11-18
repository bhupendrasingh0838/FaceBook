package bhup10.Facebook.Service;

import bhup10.Facebook.Entity.Post;
import bhup10.Facebook.Repository.PostRepository;
import bhup10.Facebook.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    @Autowired
    UserRepository userRepository;

    public List<Post> getAllPost(){
        return (List<Post>) postRepository.findAll();
    }
    public Post postById(int id){
        return postRepository.findById(id).get();

    }

    public void createPost(Post post){
        postRepository.save(post);
    }
    public Post createPost(int id,Post post){
        post.setUser(userRepository.findById(id).get());
        return postRepository.save(post);
    }
    public void deletePost(int id){
        postRepository.deleteById(id);
    }

    public Post updatePost(int id,Post post){
        Post post1=postRepository.findById(id).get();
        post1.setPost(post.getPost());
        postRepository.save(post1);
        return  post1;


    }
}
