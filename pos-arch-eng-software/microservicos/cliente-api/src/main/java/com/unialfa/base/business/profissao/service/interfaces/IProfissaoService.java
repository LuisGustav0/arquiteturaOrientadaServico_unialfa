package com.unialfa.base.business.profissao.service.interfaces;

import com.unialfa.base.business.profissao.service.plus.ProfissaoDeleteByIdService;
import com.unialfa.base.business.profissao.service.plus.ProfissaoFindAllService;
import com.unialfa.base.business.profissao.service.plus.ProfissaoFindByIdService;
import com.unialfa.base.business.profissao.service.plus.ProfissaoGetRepositoryService;
import com.unialfa.base.business.profissao.service.plus.ProfissaoSaveService;

public interface IProfissaoService extends ProfissaoDeleteByIdService,
                                           ProfissaoFindAllService,
                                           ProfissaoFindByIdService,
                                           ProfissaoGetRepositoryService,
                                           ProfissaoSaveService {

}
