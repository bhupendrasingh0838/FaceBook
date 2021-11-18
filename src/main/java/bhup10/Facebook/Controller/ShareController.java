package bhup10.Facebook.Controller;

import bhup10.Facebook.Entity.Share;
import bhup10.Facebook.Service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShareController {
    @Autowired
    ShareService shareService;

    @GetMapping("/getAllShare")
    public List<Share> getAllShare() {
        return (List<Share>) shareService.getAllShare();
    }
    @GetMapping("/shareById/{id}")
    public Share shareById(@PathVariable int id) {
        return shareService.shareById(id);


    }
    @PostMapping("/createShare/{id}")
    public String createShare(@PathVariable int id,@RequestBody Share share) {
        shareService.createShare(id, share);
        return "Data Created";
    }
    @DeleteMapping("/deleteShare/{id}")
    public String deleteShare(@PathVariable int id) {
        shareService.deleteShare(id);
        return "Data Deleted";
    }
    @PutMapping("/updateShare/{id}")
    public Share updateShare(@PathVariable int id,@RequestBody Share share){
        shareService.updateShare(id, share);
        return share;
    }
}
