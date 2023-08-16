
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidad.Estudiante;
import org.hibernate.Session;
import modelo.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
/**
 *
 * @author Ruben Figueroa
 */

public class EstudianteDao {
    public List<Estudiante> listaEstudiantes(){
        List<Estudiante> lista = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        String hql = "FROM empleado";
        try{    
            lista = sesion.createQuery(hql).list();
            t.commit();
            sesion.close();
        }catch (Exception e){
            t.rollback();
        }
        return lista;
    }
}
