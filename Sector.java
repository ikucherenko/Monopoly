
public interface Sector {
    String player = null;
    String type = null;
    String name = null;
    String description = null;
    int buildings = 0;
    String getPlayer();
    void setPlayer(String player);

    String getType();
    void setType(String type);

    String getName();
    void setName(String name);

    int getBuildings();
    void setBuildings(int buildings);

    String getDescription();
    void setDescription(String description);
}
