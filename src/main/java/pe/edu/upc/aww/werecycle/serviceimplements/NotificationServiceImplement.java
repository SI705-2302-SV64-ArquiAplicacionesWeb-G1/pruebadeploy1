package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Notification;
import pe.edu.upc.aww.werecycle.repositories.IUNotificationRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUNotificationService;

import java.util.List;

@Service
public class NotificationServiceImplement implements IUNotificationService {
@Autowired
    private IUNotificationRepository nO;

    @Override
    public void insert(Notification notification) {
        nO.save(notification);
    }

    @Override
    public List<Notification> list() {
        return nO.findAll();
    }

    @Override
    public void delete(int idNotification) {
    nO.deleteById(idNotification);
    }

    @Override
    public List<Notification> findByNotifationEvent() {
        return nO.findByTypeNotification("evento");
    }

    @Override
    public List<Notification> findByNotificationReminder() {
        return nO.findByTypeNotification("recordatorio");
    }

    @Override
    public List<Notification> findByNotificationLike() {
        return nO.findByTypeNotification("like");
    }

    @Override
    public List<Notification> findByNotificationComment() {
        return nO.findByTypeNotification("comentario");
    }

    @Override
    public List<Notification> findByNotificationInvitation() {
        return nO.findByTypeNotification("invitacion");
    }


}
