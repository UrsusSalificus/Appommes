package inc.toudous.appommes;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


@Database(entities = {Apples.class}, version = 1)
public abstract class ApplesRoomDatabase extends RoomDatabase {
    public abstract ApplesDAO applesDAO();

}

// You are at 7. Add a Room database

