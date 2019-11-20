package com.unialfa.base.business.profissao.resources.interfaces;

import com.unialfa.base.business.profissao.resources.plus.ProfissaoDeleteByIdResource;
import com.unialfa.base.business.profissao.resources.plus.ProfissaoFindAllResource;
import com.unialfa.base.business.profissao.resources.plus.ProfissaoFindByIdResource;
import com.unialfa.base.business.profissao.resources.plus.ProfissaoGetServiceResource;
import com.unialfa.base.business.profissao.resources.plus.ProfissaoSaveResource;

public interface IProfissaoResource extends ProfissaoDeleteByIdResource,
                                            ProfissaoFindAllResource,
                                            ProfissaoFindByIdResource,
                                            ProfissaoGetServiceResource,
                                            ProfissaoSaveResource {

}
