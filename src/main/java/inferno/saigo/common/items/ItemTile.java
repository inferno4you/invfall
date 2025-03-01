package inferno.saigo.common.items;

import inferno.saigo.common.tiles.Tile;

public class ItemTile extends Item {
    private final Tile reference;

    public ItemTile(Tile tile) {
        super(tile.getRegistryName());
        this.reference = tile;
    }

    public Tile getTile() {
        return reference;
    }
}
