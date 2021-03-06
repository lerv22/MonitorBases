package Beans;

public class TableValues {

    private String owner;
    private float usedSpace;//In KB.
    private int numRows;
    private int avgRowLen;
    private String tablespace;

    public TableValues(String owner, float usedSpace, int numRows, int avgRowLen, String tablespace) {
        this.owner = owner;
        this.usedSpace = usedSpace;
        this.numRows = numRows;
        this.avgRowLen = avgRowLen;
        this.tablespace = tablespace;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(owner).append(";");
        str.append(usedSpace).append(";");
        str.append(numRows).append(";");
        str.append(avgRowLen).append(";");
        str.append(tablespace);
        return str.toString();
    }

    public String getTablespace() {
        return tablespace;
    }

    public void setTablespace(String tablespace) {
        this.tablespace = tablespace;
    }

    public TableValues() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(float usedSpace) {
        this.usedSpace = usedSpace;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getAvgRowLen() {
        return avgRowLen;
    }

    public void setAvgRowLen(int avgRowLen) {
        this.avgRowLen = avgRowLen;
    }

}
