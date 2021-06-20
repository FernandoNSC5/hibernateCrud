package br.com.bluemoth.HibernateCrud.gateway.dto;

/**
 * The Game Transfer Object
 *
 * @author znogfer
 * @since 0.0.2
 */
public class GameDTO
{

    private Long gameId;

    private String gameName;

    private int baseAge;

    public GameDTO()
    {}

    public GameDTO(Long pGameId, String pGameName, int pBaseAge)
    {
        this.gameId = pGameId;
        this.gameName = pGameName;
        this.baseAge = pBaseAge;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getBaseAge() {
        return baseAge;
    }

    public void setBaseAge(int baseAge) {
        this.baseAge = baseAge;
    }
}
