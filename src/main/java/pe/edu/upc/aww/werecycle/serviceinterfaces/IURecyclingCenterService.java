package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.RecyclingCenter;

import java.sql.Time;
import java.util.List;

public interface IURecyclingCenterService {
    public void insert(RecyclingCenter recyclingCenter);
    public List<RecyclingCenter>list();
    public void delete(int idRecyclingCenter);
    List<RecyclingCenter>findRecyclingCenterByNameRecyclingCenter(String NameRecyclingCenter);
    List<RecyclingCenter>findRecyclingCenterByOpeninghourRecyclingCenter(Time openinghourRecyclingCenter);
    List<RecyclingCenter>findRecyclingCenterByClosingtimeRecyclingCenter(Time closingtimeRecyclingCenter);
}
