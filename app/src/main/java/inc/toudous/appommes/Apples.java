package inc.toudous.appommes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

// This class will create the entity (= database "table")

@Entity(tableName = "apples")
public class Apples {
    @PrimaryKey(autoGenerate = true)
    private int id;

    public String variety;

    @ColumnInfo(name = "growth_place")
    public String growthPlace;

    @ColumnInfo(name = "consumption_date")
    public String consumptionDate;

    public String fruity;

    public String juicy;

    public String sweety;

    public String acidic;

    public String pulp;

}
