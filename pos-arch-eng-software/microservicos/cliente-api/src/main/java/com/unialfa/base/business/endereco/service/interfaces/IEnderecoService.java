package com.unialfa.base.business.endereco.service.interfaces;

import com.unialfa.base.business.endereco.service.plus.EnderecoDeleteByIdService;
import com.unialfa.base.business.endereco.service.plus.EnderecoFindAllService;
import com.unialfa.base.business.endereco.service.plus.EnderecoFindByIdService;
import com.unialfa.base.business.endereco.service.plus.EnderecoGetRepositoryService;
import com.unialfa.base.business.endereco.service.plus.EnderecoSaveService;

public interface IEnderecoService extends EnderecoDeleteByIdService,
                                          EnderecoFindAllService,
                                          EnderecoFindByIdService,
                                          EnderecoGetRepositoryService,
                                          EnderecoSaveService {
}
