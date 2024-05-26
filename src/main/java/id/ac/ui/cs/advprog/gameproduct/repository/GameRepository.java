package id.ac.ui.cs.advprog.gameproduct.repository;

import id.ac.ui.cs.advprog.gameproduct.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByNameContainingIgnoreCase(String name);
}
