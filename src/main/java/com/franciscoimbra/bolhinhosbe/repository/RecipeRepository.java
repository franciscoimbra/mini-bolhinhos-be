package com.franciscoimbra.bolhinhosbe.repository;

import com.franciscoimbra.bolhinhosbe.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
