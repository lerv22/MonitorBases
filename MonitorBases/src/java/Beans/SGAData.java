/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author Javier
 */
public class SGAData {

    private int javaPoolTotal;
    private int sharedPoolTotal;
    private int largePoolTotal;
    private int javaPoolUsed;
    private int sharedPoolUsed;
    private int largePoolUsed;

    public SGAData(int javaPoolTotal, int sharedPoolTotal, int largePoolTotal, int javaPoolUsed, int sharedPoolUsed, int largePoolUsed) {
        this.javaPoolTotal = javaPoolTotal;
        this.sharedPoolTotal = sharedPoolTotal;
        this.largePoolTotal = largePoolTotal;
        this.javaPoolUsed = javaPoolUsed;
        this.sharedPoolUsed = sharedPoolUsed;
        this.largePoolUsed = largePoolUsed;
    }

    public void updateValues(int javaPoolTotal, int sharedPoolTotal, int largePoolTotal, int javaPoolUsed, int sharedPoolUsed, int largePoolUsed) {
        this.javaPoolTotal = javaPoolTotal;
        this.sharedPoolTotal = sharedPoolTotal;
        this.largePoolTotal = largePoolTotal;
        this.javaPoolUsed = javaPoolUsed;
        this.sharedPoolUsed = sharedPoolUsed;
        this.largePoolUsed = largePoolUsed;
    }

    public SGAData() {
    }

    public int getJavaPoolTotal() {
        return javaPoolTotal;
    }

    public void setJavaPoolTotal(int javaPoolTotal) {
        this.javaPoolTotal = javaPoolTotal;
    }

    public int getSharedPoolTotal() {
        return sharedPoolTotal;
    }

    public void setSharedPoolTotal(int sharedPoolTotal) {
        this.sharedPoolTotal = sharedPoolTotal;
    }

    public int getLargePoolTotal() {
        return largePoolTotal;
    }

    public void setLargePoolTotal(int largePoolTotal) {
        this.largePoolTotal = largePoolTotal;
    }

    public int getJavaPoolUsed() {
        return javaPoolUsed;
    }

    public void setJavaPoolUsed(int javaPoolUsed) {
        this.javaPoolUsed = javaPoolUsed;
    }

    public int getSharedPoolUsed() {
        return sharedPoolUsed;
    }

    public void setSharedPoolUsed(int sharedPoolUsed) {
        this.sharedPoolUsed = sharedPoolUsed;
    }

    public int getLargePoolUsed() {
        return largePoolUsed;
    }

    public void setLargePoolUsed(int largePoolUsed) {
        this.largePoolUsed = largePoolUsed;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(sharedPoolUsed).append(";").append(sharedPoolTotal).append(";")
                .append(largePoolUsed).append(";").append(largePoolTotal).append(";")
                .append(javaPoolUsed).append(";").append(javaPoolTotal);
        return str.toString();
    }
}
