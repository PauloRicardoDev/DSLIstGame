package br.com.pauloricardodev.dslist.repositories;

import br.com.pauloricardodev.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
