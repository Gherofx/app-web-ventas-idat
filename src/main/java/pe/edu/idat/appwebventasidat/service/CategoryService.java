package pe.edu.idat.appwebventasidat.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.appwebventasidat.model.bd.Category;

import java.util.List;

@Service
@NoArgsConstructor
public class CategoryService {
    private pe.edu.idat.appwebventasidat.repository.CategoryRepository categoryRepository;

    public List<Category> listarCategorias(){
        return categoryRepository.findAll();
    }
}
