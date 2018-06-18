package com.zipcodewilmington.assessment2.part5;

public class SqlCommands {

    /**
     * Select all the record from a table
     * @param tableName table to retrieve the records
     * @return SQL statement to select all the records
     */
    public String selectAll(String tableName){
        return "SELECT * FROM " + tableName +";";
    }

    /**
     * Select all the data for a given column
     * @param tableName table to retrieve the records
     * @param column column to select
     * @return SQL statement to get the column data
     */
    public String selectColumn(String tableName, String column) {

        return "select " + column +" from " + tableName+";";
    }

    /**
     * Select all the records whose column is the given value
     * @param tableName table to retrieve the records
     * @param column what to filter
     * @param value value to filter by
     * @return SQL statement to filter the data
     */
    public String selectWhere(String tableName, String column, String value) {
        String select = "select * from "+ tableName +" where "+ column + "=\"" + value+"\";";
        System.out.println(select);
        return select;


    }

    /**
     * Select all the records, order the records by the column given in descending order
     * @param tableName table to retrieve the records
     * @param columnToSort
     * @return SQL statement to select all the sorted records
     */
    public String selectInDescendingOrder(String tableName, String columnToSort) {
       String select = "select * from " +tableName + " order by " +columnToSort+ " desc;";
        System.out.println(select);
        return select;
    }

    /**
     * Count how many record is in the table.
     * @param tableName table to retrieve the records
     * @return SQL statement to count the record
     */
    public String count(String tableName) {
        String select= "select count(*) from "+ tableName+";";
        System.out.println(select);
        return select;
    }

    /**
     * Count how many record is in the table whose column is the given value
     * @param tableName table to retrieve the records
     * @return SQL statement to count the record
     */
    public String countWhere(String tableName, String column, String value) {
        String select = "select count(*) from " + tableName + " where " + column +"=\""+ value+"\";";
        System.out.println(select);
        return select;
    }

}
