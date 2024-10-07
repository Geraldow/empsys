package net.empsys.employee.contract;

public interface CrudMethods <T, ID>{

    // Create
    T createEntity( T entity );

    // Read
    T searchEntityById( ID id );
    T[] searchAllEntities();

    // Update
    T updateEntity( T entity );

    // Delete
    void deleteEntityByID(ID id);

}
