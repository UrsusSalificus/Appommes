package inc.toudous.appommes;

import android.arch.persistence.room.Insert;

// This interface setup a DAO (data access object) = SQL queries are associated with method calls

public interface ApplesDAO {
    @Insert
    void insert(Apples apple);
}
