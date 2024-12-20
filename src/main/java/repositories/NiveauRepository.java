package repositories;

import entity.Niveau;
import java.util.ArrayList;
import java.util.List;

public class NiveauRepository {
    private List<Niveau> niveauxList = new ArrayList<>();

    
    public void addNiveau(Niveau niveau) {
        niveau.setId(niveauxList.size() + 1); 
        niveauxList.add(niveau);
    }

    
    public List<Niveau> getAllNiveaux() {
        return niveauxList;
    }

    
    public Niveau getNiveauById(int id) {
        return niveauxList.stream().filter(n -> n.getId() == id).findFirst().orElse(null);
    }
}
