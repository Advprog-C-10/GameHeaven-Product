package id.ac.ui.cs.advprog.gameproduct.controller;

import id.ac.ui.cs.advprog.gameproduct.model.Game;
import id.ac.ui.cs.advprog.gameproduct.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/search")
    public List<Game> searchGamesByName(@RequestParam String name) {
        return gameService.searchGamesByName(name);
    }

    @GetMapping("/{id}")
    public Game searchGameById(@PathVariable Long id) {
        return gameService.searchGameById(id);
    }
}