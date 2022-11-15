package com.company.jdbs;

import com.company.jdbs.services.Database;
import com.company.jdbs.services.DatabaseQueryService;

public class App {
    public static void main(String[] args) throws Exception {
        Database database = Database.getInstance();
        System.out.println(new DatabaseQueryService().findMaxSalaryWorker(database));
        System.out.println(new DatabaseQueryService().findMaxProjectsClient(database));
        System.out.println(new DatabaseQueryService().findLongestProject(database));
        System.out.println(new DatabaseQueryService().findYoungestEldestWorkers(database));
        System.out.println(new DatabaseQueryService().findProjectPrices(database));
    }
}
