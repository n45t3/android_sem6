package app.giantapp.model;

import com.annimon.stream.function.Function;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WhoAmI on 07.05.2017.
 */

public class Mapper {

    public static Function<GameRowModel, Game> gameRowModelToGame
            = new Function<GameRowModel, Game>() {

        public Game apply(GameRowModel t) {
            final int PLATFORM_MAX_COUNT = 2;
            Game game = new Game();
            game.setId(t.getId());
            game.setImage(t.getImage());
            game.setName(t.getName());
            game.setOriginal_release_date(t.getOriginal_release_date());
            Platform[] platforms = t.getPlatforms();
            String p = "";
            for (int i = 0; i < platforms.length && i < PLATFORM_MAX_COUNT; i++)
                p += platforms[i].getName() + (i < PLATFORM_MAX_COUNT - 1 ? ", " : "");
            game.setPlatforms(p);
            return game;
        }
    };

}
