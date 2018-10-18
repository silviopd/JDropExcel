/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class Funciones_Tabla extends Conexion{
    
    public void Agregar1parametro(String consulta,Object a) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar2parametro(String consulta,Object a,Object b) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar3parametro(String consulta,Object a,Object b,Object c) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar4parametro(String consulta,Object a,Object b,Object c,Object d) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar5parametro(String consulta,Object a,Object b,Object c,Object d,Object e) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar6parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar7parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f,Object g) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        sentencia1.setObject(7, g);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar8parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f,Object g,Object h) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        sentencia1.setObject(7, g);
        sentencia1.setObject(8, h);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar9parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f,Object g,Object h,Object i) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        sentencia1.setObject(7, g);
        sentencia1.setObject(8, h);
        sentencia1.setObject(9, i);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar10parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f,Object g,Object h,Object i,Object j) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        sentencia1.setObject(7, g);
        sentencia1.setObject(8, h);
        sentencia1.setObject(9, i);
        sentencia1.setObject(10, j);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar11parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f,Object g,Object h,Object i,Object j,Object k) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        sentencia1.setObject(7, g);
        sentencia1.setObject(8, h);
        sentencia1.setObject(9, i);
        sentencia1.setObject(10, j);
        sentencia1.setObject(11, k);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar12parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f,Object g,Object h,Object i,Object j,Object k,Object l) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        sentencia1.setObject(7, g);
        sentencia1.setObject(8, h);
        sentencia1.setObject(9, i);
        sentencia1.setObject(10, j);
        sentencia1.setObject(11, k);
        sentencia1.setObject(12, l);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar13parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f,Object g,Object h,Object i,Object j,Object k,Object l,Object m) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        sentencia1.setObject(7, g);
        sentencia1.setObject(8, h);
        sentencia1.setObject(9, i);
        sentencia1.setObject(10, j);
        sentencia1.setObject(11, k);
        sentencia1.setObject(12, l);
        sentencia1.setObject(13, m);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar14parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f,Object g,Object h,Object i,Object j,Object k,Object l,Object m,Object n) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        sentencia1.setObject(7, g);
        sentencia1.setObject(8, h);
        sentencia1.setObject(9, i);
        sentencia1.setObject(10, j);
        sentencia1.setObject(11, k);
        sentencia1.setObject(12, l);
        sentencia1.setObject(13, m);
        sentencia1.setObject(14, n);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
    public void Agregar15parametro(String consulta,Object a,Object b,Object c,Object d,Object e,Object f,Object g,Object h,Object i,Object j,Object k,Object l,Object m,Object n,Object ñ) throws Exception {
        Connection transaccion = abrirConexion();
        transaccion.setAutoCommit(false);

        String sql = consulta;
        PreparedStatement sentencia1 = transaccion.prepareStatement(sql);
        sentencia1.setObject(1, a);
        sentencia1.setObject(2, b);
        sentencia1.setObject(3, c);
        sentencia1.setObject(4, d);
        sentencia1.setObject(5, e);
        sentencia1.setObject(6, f);
        sentencia1.setObject(7, g);
        sentencia1.setObject(8, h);
        sentencia1.setObject(9, i);
        sentencia1.setObject(10, j);
        sentencia1.setObject(11, k);
        sentencia1.setObject(12, l);
        sentencia1.setObject(13, m);
        sentencia1.setObject(14, n);
        sentencia1.setObject(15, ñ);
        this.ejecutarSQL(sentencia1, transaccion);

        transaccion.commit();
        transaccion.close();

    }
    
}
