package es.iescamas.programacion.ej5;

public class GestorUsuarios {
	
	public static String generarInforme(Usuario[] usuarios) {
				
		if(usuarios == null) {
			throw new IllegalArgumentException("No puede ser nulo");
		}
		int contador = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("INFORME USUARIOS\n");
		sb.append("================\n");
		
		
		for(Usuario usuario : usuarios) {
			if(usuario == null)
				continue;
			contador++;
			sb.append(contador).append(") ").append(usuario.getNombre())
			.append(" (")
			.append(usuario.getEdad())
			.append(") - ").append(usuario.getEmail()).append(" - ").append(usuario.getCiudad())
			.append("\n");
		
		}
		sb.append("TOTAL: ").append(contador);
		
		return sb.toString();
	}
	
}
