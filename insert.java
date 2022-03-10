String sql = "INSERT INTO Sno, sname, Dob, Doj  VALUES(?, ?, ?, ?)";
preparedStatement pst = cn.preparedStatement(sql);
pst.SetInt(1, Sno);
pst.SetString(2, sname);
pst.SetDate(3, Dob);
pst.SetDate(4, Doj);

int rowInserted = pst.executeUpadte();
if (rowInserted > 0)
{
    System.out.println("inserted sucessfully");
}