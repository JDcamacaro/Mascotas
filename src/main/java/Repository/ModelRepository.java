package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Mascota;

@Repository
public interface ModelRepository extends JpaRepository<Mascota,Integer> {

}
