/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import acq.*;
import java.util.ArrayList;

/**
 *
 * @author Bruger
 */
public class DataFacade implements IData {

    FileManager fm;

    public DataFacade() {
        fm = new FileManager();
    }

    @Override
    public ArrayList<IUser> readData() {
        return fm.readFile();
    }

    @Override
    public void writeData(ArrayList<IUser> data) {
        fm.writeToFile(data);
    }
}
