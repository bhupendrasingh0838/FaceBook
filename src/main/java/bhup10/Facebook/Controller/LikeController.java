package bhup10.Facebook.Controller;

import bhup10.Facebook.Entity.Like;
import bhup10.Facebook.Service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LikeController {
    @Autowired
    LikeService likeService;

    @GetMapping("/getAllLike")
    public List<Like> getAllLike() {
        return (List<Like>) likeService.getAllLike();
    }
    @GetMapping("/likeById/{id}")
    public Like likeById(@PathVariable int id) {
        return likeService.likeById(id);


    }
    @PostMapping("/createLike/{id}")
    public String createLike(@PathVariable int id ,@RequestBody Like like) {
        likeService.createLike(id, like);
        return "Data Created";
    }
    @DeleteMapping("/deleteLike/{id}")
    public String deleteLike(@PathVariable int id) {
        likeService.deleteLike(id);
        return "Data Deleted";
    }
    @PutMapping("/updateLike/{id}")
    public Like updateLike(@PathVariable int id, @RequestBody Like like){
        likeService.updateLike(id, like);
        return like;
    }
}
