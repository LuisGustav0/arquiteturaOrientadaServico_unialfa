package com.unialfa.base.business.cidade.services.interfaces;

import com.unialfa.base.business.cidade.services.plus.CidadeDeleteAllService;
import com.unialfa.base.business.cidade.services.plus.CidadeFindAllService;
import com.unialfa.base.business.cidade.services.plus.CidadeFindByIdService;
import com.unialfa.base.business.cidade.services.plus.CidadeGetRepositoryService;
import com.unialfa.base.business.cidade.services.plus.CidadeSaveAllService;

public interface ICidadeService extends CidadeDeleteAllService,
                                        CidadeFindAllService,
                                        CidadeFindByIdService,
                                        CidadeGetRepositoryService,
                                        CidadeSaveAllService {

}
