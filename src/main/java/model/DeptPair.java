package model;

public class DeptPair  {
  private String deptNum;
  private String  deptName;

  public DeptPair(String deptNum, String deptName) {
    this.deptNum = deptNum;
    this.deptName = deptName;
  }
  
  public String getDeptNum() {
    return deptNum;
  }

  public String getDeptName() {
    return deptName;
  }
}
