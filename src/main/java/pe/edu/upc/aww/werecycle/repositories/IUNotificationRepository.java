package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.Notification;

import java.util.List;

@Repository
public interface IUNotificationRepository extends JpaRepository<Notification,Integer> {
    List<Notification> findByTypeNotification(String TypeNotification);

}
