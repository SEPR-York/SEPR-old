import com.badlogic.gdx.Game;
import com.mygdx.game.Main;
import com.mygdx.game.Player;
import com.mygdx.game.Roboticon;
import com.mygdx.game.Tile;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Kieran Hall KJH532
 * @version 1.0
 * @since 1.0
 */
public class RoboticonTest extends TesterFile {

    private Game game = new Main();
    private Player TestPlayer = new Player(0);
    private Tile TestTile = new Tile(game, 0,0,0,0, 0, 0, true, new Runnable() {
        @Override
        public void run() {

        }
    });
    private Roboticon TestRobot = new Roboticon(0, TestPlayer, TestTile);

    /**
     * Tests confirming that a valid Roboticon can be upgraded.
     */
    @Test
    public void ValidUpgrade() {
        Integer NewLevel[] = {2, 1, 1};
        TestRobot.upgrade("Ore");
        assertArrayEquals(NewLevel, TestRobot.getLevel());
        NewLevel[1] = 2;
        TestRobot.upgrade("Energy");
        assertArrayEquals(NewLevel, TestRobot.getLevel());
        NewLevel[2] = 2;
        TestRobot.upgrade("Food");
        assertArrayEquals(NewLevel, TestRobot.getLevel());
    }

    /**
     * Test confirming the possibleUpgrades method returns the possible upgrades available
     */
    @Test
    public void ValidUpgradeReturn() {
        Integer TestUpgrades[] = {2, 2, 2};
        assertArrayEquals(TestRobot.possibleUpgrades(), TestUpgrades);
    }

    /**
     * Test confirming productionModifier method works and provides values within a reasonable range
     */
    @Test
    public void ValidProductionModifier() {

        Integer Modifiers[] = TestRobot.productionModifier();

        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 3; i++) {
                Integer current = Modifiers[i];
                assertTrue(Modifiers[i] < 6);
            }
        }
    }
}
