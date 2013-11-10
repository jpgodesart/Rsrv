/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.data;

import java.util.ArrayList;
import java.util.HashMap;
import net.daw.helper.Enum;
import net.daw.helper.FilterBean;

/**
 *
 * @author rafa
 */
public interface GenericData {

    public void conexion(Enum.Connection tipo) throws Exception;

    public void desconexion() throws Exception;

    public void initTrans() throws Exception;

    public void commitTrans() throws Exception;

    public void rollbackTrans() throws Exception;

    public void removeOne(int intId, String strTabla) throws Exception;

    public int insertOne(String strTabla) throws Exception;

    public void setNull(int intId, String strTabla, String strCampo) throws Exception;

    public void updateOne(int intId, String strTabla, String strCampo, String strValor) throws Exception;

    public String getId(String strTabla, String strCampo, String strValor) throws Exception;

    public String getOne(String strTabla, String strCampo, int id) throws Exception;

    public Boolean existsOne(String strTabla, int id) throws Exception;

    public int getPages(String strTabla, int intRegsPerPage,ArrayList<FilterBean> alFilter, HashMap<String, String> hmOrder) throws Exception;

    //public int getPagesForeign(String strForeignTable, int intIdForeign, String strForeignField, String strTabla, int intRegsPerPage, int intPagina, ArrayList<FilterBean> alFilter, HashMap<String, String> hmOrder) throws Exception;

    public ArrayList<Integer> getPage(String strTabla, int intRegsPerPage, int intPagina, ArrayList<FilterBean> alFilter, HashMap<String, String> hmOrder) throws Exception;

    //public ArrayList<Integer> getPageForeign(String strForeignTable, int intIdForeign, String strForeignField, String strTabla, int intRegsPerPage, int intPagina, int intPagina, ArrayList<FilterBean> alFilter, HashMap<String, String> hmOrder) throws Exception;

    public ArrayList<String> getNeighborhood(String strLink, int intPageNumber, int intTotalPages, int intNeighborhood) throws Exception;

}
