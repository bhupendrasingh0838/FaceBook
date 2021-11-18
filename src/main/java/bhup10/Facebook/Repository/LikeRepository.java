package bhup10.Facebook.Repository;

import bhup10.Facebook.Entity.Like;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends CrudRepository<Like,Integer> {
}
