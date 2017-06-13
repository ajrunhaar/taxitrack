package com.riftinnovation.pindrop.data;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by anton on 6/13/2017.
 */

public class DatabaseConfigUtil extends OrmLiteConfigUtil {

    public static void main(String[] args) throws SQLException,IOException{
        writeConfigFile("ormlite_config.txt");
    }

}
