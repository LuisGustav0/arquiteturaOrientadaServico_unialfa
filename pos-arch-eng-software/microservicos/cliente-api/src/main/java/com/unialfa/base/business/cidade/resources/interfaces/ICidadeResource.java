package com.unialfa.base.business.cidade.resources.interfaces;

import com.unialfa.base.business.cidade.resources.plus.CidadeDeleteAllResource;
import com.unialfa.base.business.cidade.resources.plus.CidadeFindAllResource;
import com.unialfa.base.business.cidade.resources.plus.CidadeFindByIdResource;
import com.unialfa.base.business.cidade.resources.plus.CidadeGetServiceResource;
import com.unialfa.base.business.cidade.resources.plus.CidadeSaveAllResource;

public interface ICidadeResource extends CidadeDeleteAllResource,
                                         CidadeFindAllResource,
                                         CidadeFindByIdResource,
                                         CidadeGetServiceResource,
                                         CidadeSaveAllResource {

}
