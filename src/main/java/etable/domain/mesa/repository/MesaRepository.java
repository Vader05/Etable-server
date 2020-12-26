package etable.domain.mesa.repository;

import java.util.List;

import etable.domain.mesa.model.Mesa;
import etable.domain.mesa.model.MesaDTO;
public interface MesaRepository {

	List<MesaDTO> getMesas();
	Mesa actualizarMesaById(Mesa mesa, int id);
	boolean eliminarMesaById(int id);
	Mesa crearMesa(Mesa mesa);
	Mesa getMesaById(int id);
}
