package com.unialfa.base.business.cliente.service;

import com.unialfa.base.business.cliente.respository.ClienteRepository;
import com.unialfa.base.business.cliente.service.plus.ClienteDeleteById;
import com.unialfa.base.business.cliente.service.plus.ClienteFindAll;
import com.unialfa.base.business.cliente.service.plus.ClienteFindById;
import com.unialfa.base.business.cliente.service.plus.ClienteSave;

public interface ClienteService extends ClienteFindById,
                                        ClienteFindAll,
                                        ClienteSave,
                                        ClienteDeleteById,
                                        ClienteRepository {
}
