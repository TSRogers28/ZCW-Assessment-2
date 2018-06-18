package com.zipcodewilmington.assessment2.part5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqlTest {
    private SqlCommands commands;

    @Before
    public void test(){
        commands = new SqlCommands();
    }


    @Test
    public void testSelectAll() {
        String tableName = "Customers";

        String actual = commands.selectAll(tableName);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 346504158;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectColumn() {
        String tableName = "Customers";
        String column = "Country";

        String actual = commands.selectColumn(tableName, column);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 525300554;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectColumn_forId() {
        String tableName = "Customers";
        String column = "CustomerID";

        String actual = commands.selectColumn(tableName, column);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = -1758879643;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectWhereForCity() {
        String tableName = "Customers";
        String column = "City";
        String value = "Berlin";

        String actual = commands.selectWhere(tableName, column, value);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = -1689165003;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectWhereForCountry() {
        String tableName = "Customers";
        String column = "Country";
        String value = "Mexico";

        String actual = commands.selectWhere(tableName, column, value);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = -1584030561;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testSelectInDescendingOrder() {
        String tableName = "Customers";
        String column = "City";

        String actual = commands.selectInDescendingOrder(tableName, column);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 779317431;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testCount() {
        String tableName = "Customers";

        String actual = commands.count(tableName);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = 696275876;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testCountWhere() {
        String tableName = "Customers";
        String column = "Country";
        String value = "Germany";

        String actual = commands.countWhere(tableName, column, value);
        int actualHashCode = getHashCode(actual);
        int expectedHashCode = -1273996319;

        Assert.assertEquals(expectedHashCode, actualHashCode);
    }

    private int getHashCode(String actual) {
        return actual.replace(" ", "").toLowerCase().hashCode();
    }
}
