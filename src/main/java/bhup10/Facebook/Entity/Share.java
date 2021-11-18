package bhup10.Facebook.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Share implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userShare;
    @ManyToOne
    @JsonBackReference
    private Post post;

    public Share() {
    }

    public Share(int id, String userShare, Post post) {
        this.id = id;
        this.userShare = userShare;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserShare() {
        return userShare;
    }

    public void setUserShare(String userShare) {
        this.userShare = userShare;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Share{" +
                "id=" + id +
                ", userShare='" + userShare + '\'' +
                ", post=" + post +
                '}';
    }
}
