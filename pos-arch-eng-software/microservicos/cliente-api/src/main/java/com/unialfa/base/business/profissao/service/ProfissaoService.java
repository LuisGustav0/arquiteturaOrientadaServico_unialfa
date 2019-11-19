package com.unialfa.base.business.profissao.service;

import com.unialfa.base.business.profissao.respository.ProfissaoRepository;
import com.unialfa.base.business.profissao.service.plus.ProfissaoDeleteById;
import com.unialfa.base.business.profissao.service.plus.ProfissaoFindAll;
import com.unialfa.base.business.profissao.service.plus.ProfissaoFindById;
import com.unialfa.base.business.profissao.service.plus.ProfissaoSave;

public interface ProfissaoService extends ProfissaoFindById,
                                          ProfissaoFindAll,
                                          ProfissaoSave,
                                          ProfissaoDeleteById,
                                          ProfissaoRepository {
}
