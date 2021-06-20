package br.com.bluemoth.HibernateCrud.gateway.dto;

/**
 * The Player Transfer Object
 *
 * @author znogfer
 * @since 0.0.1
 */
public class PlayerDTO
{

    private Long playerId;

    private String name;

    private String nickName;

    private GameDTO favoriteGame;

    public PlayerDTO(Long pPlayerId, String pName, String pNickName, GameDTO pGameDTO)
    {
        this.playerId = pPlayerId;
        this.name = pName;
        this.nickName = pNickName;
        this.favoriteGame = pGameDTO;
    }

    public PlayerDTO(Long pPlayerId, String pName, String pNickName)
    {
        this.playerId = pPlayerId;
        this.name = pName;
        this.nickName = pNickName;
    }

    public PlayerDTO()
    {}

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public GameDTO getFavoriteGame()
    {
        return favoriteGame;
    }

    public void setFavoriteGame(GameDTO pFavoriteGame)
    {
        this.favoriteGame = pFavoriteGame;
    }
}
