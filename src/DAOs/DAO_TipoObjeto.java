package DAOs;

import DTOS.DTO_Autor;
import DTOS.DTO_TipoObjeto;
import HibernateNormal.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DAO_TipoObjeto {
    private Session session;
    private Transaction tx;


    public int guardaTipoObjeto (DTO_TipoObjeto dto_tipoObjeto) throws HibernateException {
        int id=0;

        try{
            iniciaOperacion();
            id = (int) session.save(dto_tipoObjeto);
            tx.commit();
        }catch (HibernateException he){
            manejaExcepcion (he);
            throw he;
        }finally {
            session.close();
        }
        return id;
    }

    public void actualizaTipoObjeto (DTO_TipoObjeto dto_tipoObjeto){
        try {
            iniciaOperacion();
            session.update(dto_tipoObjeto);
            tx.commit();
        }catch (HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally {
            session.close();
        }
    }

    public void eliminaTipoObjeto (DTO_TipoObjeto dto_tipoObjeto) throws HibernateException{
        try {
            iniciaOperacion();
            session.delete(dto_tipoObjeto);
            tx.commit();
        }catch (HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally {
            session.close();
        }
    }

    public DTO_TipoObjeto obtenerTipoObjeto (int idTipoObjeto) throws HibernateException{
        DTO_TipoObjeto dto_tipoObjeto= null;
        try {
            iniciaOperacion();
            dto_tipoObjeto = (DTO_TipoObjeto) session.get(DTO_TipoObjeto.class, idTipoObjeto);
        }finally {
            session.close();
        }
        return dto_tipoObjeto;
    }

    public List<DTO_TipoObjeto> obtenerListaTipoObjeto () throws HibernateException{
        List<DTO_TipoObjeto> listaTipoObjeto = null;
        try {
            iniciaOperacion();
            listaTipoObjeto = session.createQuery("from TipoobjetoEntity ").list();
        }finally {
            session.close();
        }
        return listaTipoObjeto;
    }

    private void iniciaOperacion() throws HibernateException{
        session = HibernateUtil.getSessionFactory().openSession();
    }
    private void manejaExcepcion(HibernateException he) throws HibernateException{
        tx.rollback();
        throw new HibernateException("Ocurrio un error en la capa acceso de datos", he);
    }
}
