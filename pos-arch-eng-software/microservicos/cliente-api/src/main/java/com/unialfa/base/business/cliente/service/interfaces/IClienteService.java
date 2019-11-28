package com.unialfa.base.business.cliente.service.interfaces;

import com.unialfa.base.business.cliente.service.plus.ClienteDeleteByIdService;
import com.unialfa.base.business.cliente.service.plus.ClienteFindByIdEnderecoService;
import com.unialfa.base.business.cliente.service.plus.ClienteFindAllService;
import com.unialfa.base.business.cliente.service.plus.ClienteFindByIdService;
import com.unialfa.base.business.cliente.service.plus.ClienteGetRepositoryService;
import com.unialfa.base.business.cliente.service.plus.ClienteSaveService;

public interface IClienteService extends ClienteDeleteByIdService,
                                         ClienteFindAllService,
                                         ClienteFindByIdService,
                                         ClienteGetRepositoryService,
                                         ClienteSaveService,
                                         ClienteFindByIdEnderecoService {
}
