package com.unialfa.base.business.estado.services.interfaces;

import com.unialfa.base.business.estado.services.plus.EstadoDeleteAllService;
import com.unialfa.base.business.estado.services.plus.EstadoFindAllService;
import com.unialfa.base.business.estado.services.plus.EstadoFindByIdService;
import com.unialfa.base.business.estado.services.plus.EstadoGetRepositoryService;
import com.unialfa.base.business.estado.services.plus.EstadoSaveAllService;

public interface IEstadoService extends EstadoDeleteAllService,
                                        EstadoFindAllService,
                                        EstadoFindByIdService,
                                        EstadoGetRepositoryService,
                                        EstadoSaveAllService {

}
