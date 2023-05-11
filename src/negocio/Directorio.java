package negocio;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

public class Directorio {
    
    private HashMap<String,Cliente> registro=new HashMap<String,Cliente>();
    
    public boolean agregarCliente(String telefono, Cliente c) {
        boolean agregado = false;
        if (!registro.containsKey(telefono)) {
            registro.put(telefono, c);
            agregado = true;
        }
        return agregado;
    }
    
    public Cliente buscarCliente(String numTelefono){
        
        Cliente cliente = null;
        if (registro.containsKey(numTelefono)) {
            cliente = registro.get(numTelefono);
        }
        return cliente;
        
    }

    public ArrayList<Cliente> buscarClientes(String ciudad){
        
        ArrayList<Cliente>buscar= new ArrayList();
        Set<String> claves=registro.keySet();
       Iterator<String> it = claves.iterator();
       while(it.hasNext()){
           String claveActual=it.next();
           Cliente clienteActual=registro.get(claveActual);
           
           if(clienteActual.getCiudad().equals(ciudad)){
               buscar.add(clienteActual);
           }         
       }
        return buscar;
    }
    
    public ArrayList<String> buscarTelefono(String apellido){
        ArrayList <String> num= new ArrayList<String>();
        for (Map.Entry<String, Cliente> entry : registro.entrySet()) {
            if(registro.containsValue(apellido)){
                num.add(entry.getKey());
            }
        }
        //hola
        //Iterator <String> i= num.iterator();
        //while(i.hasNext()){
           //System.out.println(i.next());
        //}
        return num;
    }
    
    public void borrarCliente(String telefono){
        Cliente cliente = registro.get(telefono);
        //Cliente cliente = registro.remove(telefono);
        
        if (registro.containsKey(telefono)) {
            registro.remove(telefono);
            JOptionPane.showMessageDialog(null,"El cliente " + cliente.getApellido() + " " + cliente.getNombre()
            + " Se ha eliminado correctamente.");
        }
        else {
            JOptionPane.showMessageDialog(null,"Cliente no encontrado.");
        }
        //if (cliente == null) {
            //JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente.");
        //} else {
           //JOptionPane.showMessageDialog(null,"Cliente no encontrado.");
        //}
    }
}
