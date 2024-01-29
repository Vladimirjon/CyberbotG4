public class Reactor {
    private boolean pjreactor;
    private int pjBateria;

    public Reactor() {
        this.pjreactor = false;
        this.pjBateria = 100;
    }

    public boolean isPjreactor() {
        return pjreactor;
    }

    public void setPjreactor(boolean pjreactor) {
        this.pjreactor = pjreactor;
    }

    public boolean ispjReactorequipped() {
        return pjreactor;
    }

    public int getPjBateria() {
        return pjBateria;
    }

    public void BarraPorciento() {
        int porcentaje = 100;
        int delayMilisegundos = 100;

        for (int i = 0; i <= porcentaje; i++) {
            int caracteresLlenos = (i * 20) / 100;
            mostrarBarraDeProgreso(caracteresLlenos, 20);
            try {
                Thread.sleep(delayMilisegundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void mostrarBarraDeProgreso(int caracteresLlenos, int longitudBarra) {
        System.out.print("[");
        for (int i = 0; i < longitudBarra; i++) {
            if (i < caracteresLlenos) {
                if (i == caracteresLlenos - 1) {
                    System.out.print(">");
                } else {
                    System.out.print("=");
                }
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("] " + caracteresLlenos * 5 + "%\r");
    }

    public void pjusandoBateria() {
        if (pjBateria > 30) {
            System.out.println("Volando y utilizando armas!");
            BarraPorciento(); // Llama a la barra de progreso aquí
        } else {
            System.out.println("Batería baja. Recargar");
        }
    }

    public void pjRecargar() {
        if (pjBateria <= 30) {
            System.out.println("Batería por debajo del 30%. Necesito recargar");
        }
    }

    public void pjcargaExobot() {
        if (pjBateria <= 10) {
            System.out.println("¡Batería en niveles críticos! Recargar urgente");
        }
    }

    public void pjcarga(int carga) {
        pjBateria += carga;
        if (pjBateria > 100) {
            pjBateria = 100;
        }
        System.out.println("Batería cargada al " + pjBateria + "%");
    }

    public void pjVolar() {
        System.out.println("Puedo volar mientras tenga energía");
    }
}