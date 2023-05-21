package br.com.pauloricardodev.dslist.services;

import br.com.pauloricardodev.dslist.dto.GameDTO;
import br.com.pauloricardodev.dslist.dto.GameMinDTO;
import br.com.pauloricardodev.dslist.entities.Game;
import br.com.pauloricardodev.dslist.projections.GameMinProjection;
import br.com.pauloricardodev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        //GameDTO dto = new GameDTO(result);
        //return dto;
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        //List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //transformando
        return result.stream().map(x -> new GameMinDTO(x)).toList(); //transformando
        //return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        //List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //transformando
        return result.stream().map(x -> new GameMinDTO(x)).toList(); //transformando
        //return dto;
    }

}
