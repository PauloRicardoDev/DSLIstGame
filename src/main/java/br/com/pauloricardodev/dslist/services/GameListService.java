package br.com.pauloricardodev.dslist.services;

import br.com.pauloricardodev.dslist.dto.GameDTO;
import br.com.pauloricardodev.dslist.dto.GameListDTO;
import br.com.pauloricardodev.dslist.dto.GameMinDTO;
import br.com.pauloricardodev.dslist.entities.Game;
import br.com.pauloricardodev.dslist.entities.GameList;
import br.com.pauloricardodev.dslist.repositories.GameListRepository;
import br.com.pauloricardodev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gamelistRepository;
    @Transactional(readOnly = true)

    public List<GameListDTO> findAll(){
        List<GameList> result = gamelistRepository.findAll();
        //List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //transformando
        return result.stream().map(x -> new GameListDTO(x)).toList(); //transformando
        //return dto;
    }
}
