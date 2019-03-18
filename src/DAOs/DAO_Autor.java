package DAOs;

import DTOS.DTO_Autor;
import HibernateNormal.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DAO_Autor {
    private Session session;
    private Transaction tx;


    public int guardaAutor (DTO_Autor dto_autor) throws HibernateException {
        int id=0;

        try{
            iniciaOperacion();
            id = (int) session.save(dto_autor);
            tx.commit();
        }catch (HibernateException he){
            manejaExcepcion (he);
            throw he;
        }finally {
            session.close();
        }
        return id;
    }

    public void actualizaAutor (DTO_Autor dto_autor){
        try {
            iniciaOperacion();
            session.update(dto_autor);
            tx.commit();
        }catch (HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally {
            session.close();
        }
    }

    public void eliminaAutor (DTO_Autor dto_autor) throws HibernateException{
        try {
            iniciaOperacion();
            session.delete(dto_autor);
            tx.commit();
        }catch (HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally {
            session.close();
        }
    }

    public DTO_Autor obtenerAutor (int idAutor) throws HibernateException{
        DTO_Autor dto_autor= null;
        try {
            iniciaOperacion();
            dto_autor = (DTO_Autor) session.get(DTO_Autor.class, idAutor);
        }finally {
            session.close();
        }
        return dto_autor;
    }

    public List<DTO_Autor> obtenerListaAutores () throws HibernateException{
        List<DTO_Autor> listaAutor = null;
        try {
            iniciaOperacion();
            listaAutor = session.createQuery("from AutorEntity ").list();
        }finally {
            session.close();
        }
        return listaAutor;
    }

    private void iniciaOperacion() throws HibernateException{
        session = HibernateUtil.getSessionFactory().openSession();
    }
    private void manejaExcepcion(HibernateException he) throws HibernateException{
        tx.rollback();
        throw new HibernateException("Ocurrio un error en la capa acceso de datos", he);
    }
}
