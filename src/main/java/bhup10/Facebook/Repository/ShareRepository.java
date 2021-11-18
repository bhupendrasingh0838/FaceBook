package bhup10.Facebook.Repository;

import bhup10.Facebook.Entity.Share;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareRepository extends CrudRepository<Share,Integer> {
}
