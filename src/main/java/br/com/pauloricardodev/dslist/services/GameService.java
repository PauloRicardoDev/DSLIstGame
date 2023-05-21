package br.com.pauloricardodev.dslist.services;

import br.com.pauloricardodev.dslist.dto.GameMinDTO;
import br.com.pauloricardodev.dslist.entities.Game;
import br.com.pauloricardodev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        //List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //transformando
        return result.stream().map(x -> new GameMinDTO(x)).toList(); //transformando
        //return dto;
    }
}
