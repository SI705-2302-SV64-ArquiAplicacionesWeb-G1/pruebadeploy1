package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Notification;

import java.time.LocalDate;
import java.util.List;

public interface IUNotificationService {
    public void insert(Notification notification);
    public List<Notification>list();
    public void delete(int idNotification);
    List<Notification> findByNotifationEvent();

    List<Notification> findByNotificationReminder();
    List<Notification> findByNotificationLike();
    List<Notification> findByNotificationComment();
    List<Notification> findByNotificationInvitation();
}
