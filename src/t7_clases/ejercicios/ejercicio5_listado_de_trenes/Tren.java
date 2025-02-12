package t7_clases.ejercicios.ejercicio5_listado_de_trenes;

public class Tren {
    enum Empresa {Renfe, Iryo, Ouigo}

    private Empresa empresa;
    private Vagon[] vagones;
    private int num_vagones;
    private Locomotora locomotora;

    // Constructor con parámetros
    Tren(int num_vagones, String[] informacionVagones, String empresa) {
        if (num_vagones > 0)
            this.num_vagones = num_vagones;
        else
            this.num_vagones = 1;

        // Controlar que el array introducido tenga al menos 2 de longitud, una para la locomotora y otra para un vagón
        if (informacionVagones.length > 1) {

            // Crear los vagones. Todos menos la posición cero de información vagones
            this.vagones = new Vagon[informacionVagones.length - 1];

            // Obtener los datos de la locomotora del array
            // En la posición 0 del array se guarda: matricula_potencia_anyo
            String matricula, potenciaCadena, anyoCadena;
            int potencia = 1, anyo = 1900;
            // Calcular las posiciones necesarias
            int posicionFinalMatricula = informacionVagones[0].indexOf("_");
            int posicionInicioAnyo = informacionVagones[0].lastIndexOf("_");

            // Guardar la matrícula
            matricula = informacionVagones[0].substring(0, posicionFinalMatricula);

            // Guardar potencia y controlar errores
            potenciaCadena = informacionVagones[0].substring(posicionFinalMatricula + 1, posicionInicioAnyo);
            try {
                potencia = Integer.parseInt(potenciaCadena);
            } catch (NumberFormatException e) {
                System.out.println("Error al introducir la potencia. Se pone la potencia por defecto.");
            }

            // Guardar anyo y controlar errores posibles
            anyoCadena = informacionVagones[0].substring(posicionInicioAnyo + 1);
            try {
                anyo = Integer.parseInt(anyoCadena);
            } catch (NumberFormatException e) {
                System.out.println("Error al introducir la potencia. Se pone la potencia por defecto.");
            }

            // Asignara a locomotora
            this.locomotora = new Locomotora(matricula, potencia, anyo);

            // Obtener los datos de los vagones del array
            // Están en las posiciones del array que no son la cero
            // Crear el array de vagones
            this.vagones = new Vagon[informacionVagones.length - 1];

            // Recorrerlo rellenando los datos
            for (int i = 1; i < vagones.length; i++) {
                // Rellenar con los datos por defecto
                vagones[i] = new Vagon(1, 1, 1, "Mineral");

                // La información se guarda así: carga_maxima:carga_actual:tipo_mercancia
                // Variables intermedias
                String cargaMaximaCadena, cargaActualCadena, tipoMercancia;
                int cargaMaxima = 1, cargaActual = 1;
                // Posiciones
                int posicionFinalCargaMaxima = informacionVagones[i].indexOf(":");
                int posicionFinalCargaActual = informacionVagones[i].lastIndexOf(":");

                cargaMaximaCadena = informacionVagones[i].substring(0, posicionFinalCargaMaxima);
                cargaActualCadena = informacionVagones[i].substring(posicionFinalCargaMaxima + 1, posicionFinalCargaActual);
                tipoMercancia = informacionVagones[i].substring(posicionFinalCargaActual + 1);

                // Intentar extraer los datos extraídos
                try {
                    cargaMaxima = Integer.parseInt(cargaMaximaCadena);
                } catch (NumberFormatException e) {
                    System.out.println("Error al introducir la carga máxima. Se pone la carga máxima por defecto.");
                }
                try {
                    cargaActual = Integer.parseInt(cargaActualCadena);
                } catch (NumberFormatException e) {
                    System.out.println("Error al introducir la carga actual. Se pone la carga actual por defecto.");
                }

                // Guardarlo en cada vagón
                vagones[i] = new Vagon(i, cargaMaxima, cargaActual, tipoMercancia);
            }

        } else { // Poner los valores por defecto
            // Valores por defecto para la locomotora
            this.locomotora = new Locomotora("0", 0, 1900);
            // Valores por defecto para un vagón
            this.vagones = new Vagon[1];
            this.vagones[0] = new Vagon(1, 1, 1, "Mineral");
        }

        Empresa[] empresasPosibles = Empresa.values();
        boolean existe = false;
        for (int i = 0; i < empresasPosibles.length && !existe; i++) {
            if (empresa.equals(empresasPosibles[i].name())) {
                this.empresa = Empresa.valueOf(empresa);
                existe = true;
            }
        }
        if (!existe) {
            this.empresa = Empresa.Renfe;
        }
    }

    // Métodos get y set
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa[] empresasPosibles = Empresa.values();
        boolean existe = false;
        for (int i = 0; i < empresasPosibles.length && !existe; i++) {
            if (empresa.equals(empresasPosibles[i].name())) {
                this.empresa = Empresa.valueOf(empresa);
            }
        }
        if (!existe) {
            this.empresa = Empresa.Renfe;
        }
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    public int getNum_vagones() {
        return num_vagones;
    }

    public void setNum_vagones(int num_vagones) {
        if (num_vagones > 0)
            this.num_vagones = num_vagones;
        else
            this.num_vagones = 1;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public void revisionDelTren() {
        System.out.printf("""
                Tren de la empresa %s
                    Locomotora con matrícula %s de potencia %d fabricada en el año %d
                """, empresa, locomotora.getMatricula(), locomotora.getPotencia(), locomotora.getAnyo());
        for (int i = 1; i < vagones.length; i++) {
            System.out.println("\tVagón " + vagones[i].getNumeroOrden() +
                    ": Carga con " + vagones[i].getCargaActual() +
                    " kilos de " + vagones[i].getTipoMercancia() +
                    " siendo su carga máxima " + vagones[i].getCargaMaxima());
        }
    }
}