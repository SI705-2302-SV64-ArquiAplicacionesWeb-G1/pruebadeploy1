package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.PurchaseRequest;
import pe.edu.upc.aww.werecycle.entities.PymentMethod;

import java.util.List;

public interface IPymentMethodService {

    public void insert(PymentMethod pymentMethod);

    public List<PymentMethod> list();
}
