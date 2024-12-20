package repositories;

import entity.Classe;
import java.util.ArrayList;
import java.util.List;

public class ClasseRepository {
    private List<Classe> classesList = new ArrayList<>();

    
    public void addClasse(Classe classe) {
        classe.setId(classesList.size() + 1); 
        classesList.add(classe);
    }

    
    public List<Classe> getAllClasses() {
        return classesList;
    }

    
    public Classe getClasseById(int id) {
        return classesList.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
}
