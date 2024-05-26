package id.ac.ui.cs.advprog.gameproduct.service;

import id.ac.ui.cs.advprog.gameproduct.model.Game;
import id.ac.ui.cs.advprog.gameproduct.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> searchGamesByName(String name) {
        return gameRepository.findByNameContainingIgnoreCase(name);
    }

    public Game searchGameById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }
}
