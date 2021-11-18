package bhup10.Facebook.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String post;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    private User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    @JsonManagedReference
    private List<Like> likes = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    // @JoinColumn(name = "comment_id")
    @JsonManagedReference
    private List<Comment> comments = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    //  @JoinColumn(name = "share_id")
    @JsonManagedReference
    private List<Share> shares = new ArrayList<>();

    public Post() {
    }

    public Post(int id, String post, User user, List<Like> likes, List<Comment> comments, List<Share> shares) {
        this.id = id;
        this.post = post;
        this.user = user;
        this.likes = likes;
        this.comments = comments;
        this.shares = shares;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", post='" + post + '\'' +
                ", user=" + user +
                ", likes=" + likes +
                ", comments=" + comments +
                ", shares=" + shares +
                '}';
    }
}
