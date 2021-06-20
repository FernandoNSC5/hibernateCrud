package br.com.bluemoth.HibernateCrud.gateway.http;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bluemoth.HibernateCrud.gateway.dto.PlayerDTO;
import br.com.bluemoth.HibernateCrud.service.CreateCrudService;

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

    @GetMapping("/player")
    public List<PlayerDTO> getPlayers()
    {
        List<PlayerDTO> playerDTOs = new ArrayList<>();

        createCrudService.findAllPlayers().forEach(player -> playerDTOs.add(
                new PlayerDTO(player.getPlayerId(),
                        player.getName(),
                        player.getNickname()
                        )));

        return playerDTOs;
    }
}
