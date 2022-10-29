package com.company.JDBC.services;

import com.company.JDBC.prefs.Prefs;
import java.nio.file.Files;
import java.nio.file.Path;

public class DatabasePopulateService {

    public static void main(String[] args) {
        Database database=Database.getInstance();
        new DatabasePopulateService().populateDb(database);
    }
    public void populateDb(Database database) {
        try {
            String populateDbFilename = new Prefs().getString(Prefs.POPULATE_DB_SQL_FILE_PATH);
            String sql = String.join("\n", Files.readAllLines(Path.of(populateDbFilename)));

            database.executeUpdate(sql);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
