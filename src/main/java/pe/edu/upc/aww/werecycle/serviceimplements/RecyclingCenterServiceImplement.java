package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.RecyclingCenter;
import pe.edu.upc.aww.werecycle.repositories.IURecyclingCenterRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IURecyclingCenterService;

import java.sql.Time;
import java.util.List;

@Service
public class RecyclingCenterServiceImplement implements IURecyclingCenterService {
    @Autowired
    private IURecyclingCenterRepository rC;

    @Override
    public void insert(RecyclingCenter recyclingCenter) {
        rC.save(recyclingCenter);
    }

    @Override
    public List<RecyclingCenter> list() {
        return rC.findAll();
    }

    @Override
    public void delete(int idRecyclingCenter) {
        rC.deleteById(idRecyclingCenter);
    }

    @Override
    public List<RecyclingCenter> findRecyclingCenterByNameRecyclingCenter(String NameRecyclingCenter) {
        return rC.findRecyclingCenterByNameRecyclingCenter(NameRecyclingCenter);
    }



    @Override
    public List<RecyclingCenter> findRecyclingCenterByOpeninghourRecyclingCenter(Time openinghourRecyclingCenter) {
        return rC.findRecyclingCenterByOpeninghourRecyclingCenter(openinghourRecyclingCenter);
    }

    @Override
    public List<RecyclingCenter> findRecyclingCenterByClosingtimeRecyclingCenter(Time closingtimeRecyclingCenter) {
        return null;
    }
}
