package org.terasology.game.modes;

import org.terasology.rendering.world.WorldRenderer;


/**
 *
 * @author Anton Kireev
 */
public interface IGameMode {
    public void init();
    public void update();
    public void render();
    public void processKeyboardInput();
    public void processMouseInput();
    
    //temprorary
    public WorldRenderer getActiveWorldRenderer();
    public void updatePlayerInput();
}
