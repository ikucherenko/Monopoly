
public class Sector1 implements Sector {

    String player = null;
    String type = null;
    String name = null;
    String description = null;
    int buildings = 0;

    @Override
    public String getPlayer() {
        return player;
    }

    @Override
    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getBuildings() {
        return buildings;
    }

    @Override
    public void setBuildings(int buildings) {
        this.buildings = buildings;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
