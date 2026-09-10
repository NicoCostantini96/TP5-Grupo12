package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Directorio {
    
    private Map<Long, Contacto> contactos = new TreeMap<>();

    public Directorio() {
    }
    
    public void agregarContacto(Long tel, Contacto cont) {
        contactos.putIfAbsent(tel, cont);
    }
    
    public Contacto buscarContacto(Long nro) {
        
        if (contactos.containsKey(nro)) {
            return contactos.get(nro);
        }
        
        return null;
    }
    
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> listadoTelefonos = new TreeSet<>();
        
        Iterator<Map.Entry<Long, Contacto>> borrador = contactos.entrySet().iterator();
        
        while (borrador.hasNext()) {
            Map.Entry<Long, Contacto> aux = borrador.next();
            
            if (aux.getValue().getApellido().equalsIgnoreCase(apellido)) {
                listadoTelefonos.add(aux.getKey());
            }
            
        }
        
        return listadoTelefonos;
    }
    
    public List<Contacto> buscarContactos(String ciudad) {
        if (contactos == null) {
            return null;
        }
        
        List<Contacto> contactosPorCiudad = new ArrayList<>();
        
        for (Contacto aux : contactos.values()) {
            if (aux.getCiudad().equalsIgnoreCase(ciudad)) {
                contactosPorCiudad.add(aux);
            }
        }
        
        return contactosPorCiudad;
    }
    
    public void borrarContacto(Long nro) {
        if (contactos != null) {
            contactos.remove(nro);
        }
    }
    
}
