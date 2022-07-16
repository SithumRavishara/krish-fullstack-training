import javax.json.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");

        if (id !=null) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "mysql");

                PreparedStatement pstm = connection.prepareStatement("SELECT * FROM Customer WHERE id=?");
                pstm.setObject(1, id);

                ResultSet rst = pstm.executeQuery();

                if (rst.next()) {
                    String name = rst.getString(2);
                    String address = rst.getString(3);

                    try (PrintWriter out = resp.getWriter()) {
                        out.println("{\n" +
                                "  \"id\": \"" + id + "\",\n" +
                                "  \"name\": \"" + name + "\",\n" +
                                "  \"address\": \"" + address + "\"\n" +
                                "}");
                    }
                } else {
                    try (PrintWriter out = resp.getWriter()) {
                        out.println("{}");
                    }
                }
            } catch (Exception ex) {
                try (PrintWriter out = resp.getWriter()) {
                    out.println("{}");
                }
                ex.printStackTrace();
            }
        }else{

            resp.setContentType("application/json");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "mysql");

                Statement stm = connection.createStatement();
                ResultSet rst = stm.executeQuery("SELECT * FROM Customer");

                PrintWriter out = resp.getWriter();

                JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();

                while(rst.next()){
                    id = rst.getString(1);
                    String name = rst.getString(2);
                    String address = rst.getString(3);

                    JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
                    objectBuilder.add("id",id);
                    objectBuilder.add("name",name);
                    objectBuilder.add("address",address);
                    JsonObject customer = objectBuilder.build();

                    arrayBuilder.add(customer);

                }

                out.println(arrayBuilder.build());

            }catch (Exception ex){
                ex.printStackTrace();
            }

        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*
         * application/json
         */

        JsonReader reader = Json.createReader(req.getReader());
        JsonObject customer = reader.readObject();

        String id = customer.getString("id");
        String name = customer.getString("name");
        String address = customer.getString("address");

        System.out.println(id);
        System.out.println(name);
        System.out.println(address);

        /*
         * application/x-www-form-urlencoded
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        */

        boolean result = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "mysql");

            PreparedStatement pstm = connection.prepareStatement("INSERT INTO Customer VALUES (?,?,?)");
            pstm.setObject(1,id);
            pstm.setObject(2, name);
            pstm.setObject(3,address);

            result = pstm.executeUpdate()> 0;

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try(PrintWriter out = resp.getWriter()){
                out.println(result?"Customer has been saved successfully":"Failed to save the customer");
            }
        }

    }
}
