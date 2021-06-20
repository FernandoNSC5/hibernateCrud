package br.com.bluemoth.HibernateCrud.gateway.http;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bluemoth.HibernateCrud.domain.Player;
import br.com.bluemoth.HibernateCrud.gateway.dto.GameDTO;
import br.com.bluemoth.HibernateCrud.gateway.dto.PlayerDTO;
import br.com.bluemoth.HibernateCrud.service.CreateCrudService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * The Player's REST class
 *
 * @author znogfer
 * @since 0.0.1
 */
@RestController
public class PlayerResource
{

    @Autowired
    private CreateCrudService createCrudService;

    /**
     * Returns all saved {@link Player}
     * @return
     *      a {@link List} of {@link PlayerDTO}
     */
    @GetMapping("/player")
    public List<PlayerDTO> getPlayers()
    {
        List<PlayerDTO> playerDTOs = new ArrayList<>();

        createCrudService.findAllPlayers().forEach(player -> {
            GameDTO gameDTO = new GameDTO(player.getGame().getGameId(), player.getGame().getName(), player.getGame().getBaseAge());
            playerDTOs.add(new PlayerDTO(player.getPlayerId(), player.getName(), player.getNickname(), gameDTO));
        });

        return playerDTOs;
    }

    /**
     * Creates a Player in database
     * @param pPlayerDTO
     *          The {@link Player} command input
     */
    @PostMapping("/player")
    public void setPlayer(@RequestBody PlayerDTO pPlayerDTO)
    {
        createCrudService.execute(new Player(pPlayerDTO.getName(), pPlayerDTO.getNickName()));
    }
}
