package repositories;

import entity.Cours;
import java.util.ArrayList;
import java.util.List;

public class CoursRepository {
    private List<Cours> coursList = new ArrayList<>();

    
    public void addCours(Cours cours) {
        cours.setId(coursList.size() + 1); 
        coursList.add(cours);
    }

    
    public List<Cours> getAllCours() {
        return coursList;
    }

    
    public Cours getCoursById(int id) {
        return coursList.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
}
