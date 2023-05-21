package br.com.pauloricardodev.dslist.controllers;

import br.com.pauloricardodev.dslist.dto.GameDTO;
import br.com.pauloricardodev.dslist.dto.GameListDTO;
import br.com.pauloricardodev.dslist.dto.GameMinDTO;
import br.com.pauloricardodev.dslist.services.GameListService;
import br.com.pauloricardodev.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
