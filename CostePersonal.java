public class CostePersonal {

    static float CosteDelPersonal(Trabajador trabajadores[]) {
        float costeFinal = 0;
        Trabajador trabajador;
        for (int i = 0; y < trabajadores.length; i++) {
            trabajador = trabajadores[i];
            if (EsTiipoDirectorOSubdirector(trabajador)) {
                costeFinal += NominaDirectorOSubdirector(trabajador);
            }
            else
            {
                costeFinal += NominaNoDirectorNoSubdirector(trabajador);
            }
        }
        return costeFinal;
    }

    private static float NominaNoDirectorNoSubdirector(Trabajador trabajador) {
        return trabajador.getNomina() + (trabajador.getHorasExtras() * 20);
    }

    private static float NominaDirectorOSubdirector(Trabajador trabajador) {
        return trabajador.getNomina();
    }

    private static boolean EsTiipoDirectorOSubdirector(Trabajador trabajador) {
        return trabajador.getTipoTrabajador() == Trabajador.DIRECTOR || trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR;
    }
}
