package Codigo;
import java.awt.Container;

public interface Vista {
	public void setControlador(Controlador controlador);

	public Container getContenedor();

	public void setModelo(Modelo modelo);
	public void adirArr();
}
