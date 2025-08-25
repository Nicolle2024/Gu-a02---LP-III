package actv1;

public class MainPersonajes {
	    public static void main(String[] args) {

	    	Habilidad Bloqueoletal = new Habilidad("Guillotina Noxiana", 60);
	        Habilidad Orbeexplosivo = new Habilidad("Choque Final", 50);

	        Guerrero g = new Guerrero("Darius", 100, 1);
	        Mago m = new Mago("Orianna", 80, 1);

	        Inventario invG = new Inventario();
	        Inventario invM = new Inventario();

	        Objeto espadaObjeto = new Objeto("Orbe Arcano");
	        invG.agregarObjeto(espadaObjeto);

	        g.usarHabilidad(Bloqueoletal, m);    
	        m.usarHabilidad(Orbeexplosivo, g);     

	        SistemaJuego sistema = new SistemaJuego();
	        sistema.subirNivel(g);        
	        sistema.subirNivel(m);         
	     
	        invG.mostrarInventario();
	    }
	}

