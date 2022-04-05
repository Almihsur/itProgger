package itProger.DB_Sql;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        List<Integer> list = new ArrayList();
        int user_id = 0;
        try {
            list = db.getData("users", "login", "john");
            for (int i : list) {
                user_id = i;
            }

            list = db.getData("items ", "category", "hats");
            for (int j : list) {
                db.insertData(user_id, j, "orders", "user_id", "item_id");
            }


            db.selectData("orders");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
