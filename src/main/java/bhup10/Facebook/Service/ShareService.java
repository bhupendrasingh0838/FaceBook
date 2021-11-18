package bhup10.Facebook.Service;

import bhup10.Facebook.Entity.Share;
import bhup10.Facebook.Repository.PostRepository;
import bhup10.Facebook.Repository.ShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareService {
    @Autowired
    ShareRepository shareRepository;
    @Autowired
    PostRepository postRepository;
    public List<Share> getAllShare(){
        return (List<Share>) shareRepository.findAll();
    }
    public Share shareById(int id){
        return shareRepository.findById(id).get();

    }
    public Share createShare(int id,Share share){
        share.setPost(postRepository.findById(id).get());
        return shareRepository.save(share);
    }
    public void deleteShare(int id){
        shareRepository.deleteById(id);
    }

    public Share updateShare(int id,Share share){
        Share share1=shareRepository.findById(id).get();
        share1.setUserShare(share.getUserShare());
        shareRepository.save(share1);
        return share1;
    }
}
