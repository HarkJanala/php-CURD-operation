String sql = "SELECT * FROM INTO Student";
preparedStatement pst = cn.preparedStatement();
ResultSet result = pst.executeQuery(sql);

int count = 0;
while(result.next())
{
    int sno = result.getInt("Sno");
    String sname = result.getString("sname");
    Date Dob = result.getDate("Dob");
    Date Doj =result.getDate("Doj");
   
     String output = "Student #%d:, %s:, %s:, %s";
     System.out.println(String.format (output, ++count, sno, sname, Dob, Doj));
}