
/**
 * Clase que implementa el estado de atendiendo
 */
public class AtendiendoEstado implements Estado {
    /**
     * Robot que sera el sujeto de nuestro Estado
     */
    Robot robot;

    /**
     * Constructor de la clase AtendiendoEstado que inicializa al robot
     * @param robot que realiza la acción
     */
    AtendiendoEstado(Robot robot) {
        this.robot = robot;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void suspender() {
        System.out.println("No puedo suspenderme, estoy atendiendo");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void activar() {
        System.out.println("Ya estoy activo :p");

    }

    /**
     * Metodo que le lee el menu al cliente
     * @param menu un menu completo
     */
    @Override
    public void leerMenu(MenuCompleto menu) {
        robot.imprimirMenuCompleto(menu);
    }

    /**
     * Metodo que toma la orden del cliente y lo cambia al estado de cocinando. 
     * @param un  menu completo
     * @param int con el id del platillo
     */
    @Override
    public void tomarOrden(MenuCompleto menu, int id) {
        if (robot.validarOrden(menu, id)) {
            System.out.println("Ok, ahorita te lo preparo.\n Si quieres ver mi proceso de cocina presiona cocinar :-}");
            robot.setEstado(robot.getCocinando());
        } else {
            System.out.println("El ID no es valido");
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cocinar(MenuCompleto menu, int id) {
        System.out.println("Todavia no tomo tu orden >:-o");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void entregarComida() {
        System.out.println("Aun no tengo tu orden");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void caminar() {
        System.out.println("Ya llegue a atenderte, no me tengo que acercar mas");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String obtenerNombreDelEstado() {
        return "Atendiendo";
    }

}
