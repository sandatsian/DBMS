package app;

import app.Columns.RealColumn;
import app.Columns.StringColumn;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();

        Schema schema = new Schema(
                Arrays.asList(new StringColumn("col1"), new RealColumn("col2")));

        ArrayList<Row> data = new ArrayList<Row>(Arrays.asList(
                new Row(new ArrayList<Cell>(
                        Arrays.asList(new Cell<>("Polina"), new Cell<Double>(2.9))))));

        db.add(new Table("t1", schema, data));
        db.add(new Table("t2", schema, data));
        Table t1 = db.get("t1");
        Row row = t1.getRow(0);
        System.out.println(row);
        System.out.println(db.getName() + ' ' + t1.getName());
        System.out.println(row.getCell(1).toString());

        //DatabaseManager dbm = new DatabaseManager();
        //dbm.save(db);




    }
}
