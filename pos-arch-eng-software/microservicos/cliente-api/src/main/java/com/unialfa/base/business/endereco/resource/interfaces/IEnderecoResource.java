package com.unialfa.base.business.endereco.resource.interfaces;

import com.unialfa.base.business.endereco.resource.plus.EnderecoDeleteByIdResource;
import com.unialfa.base.business.endereco.resource.plus.EnderecoFindAllResource;
import com.unialfa.base.business.endereco.resource.plus.EnderecoFindByIdResource;
import com.unialfa.base.business.endereco.resource.plus.EnderecoGetServiceResource;
import com.unialfa.base.business.endereco.resource.plus.EnderecoSaveResource;

public interface IEnderecoResource extends EnderecoDeleteByIdResource,
                                           EnderecoFindAllResource,
                                           EnderecoFindByIdResource,
                                           EnderecoGetServiceResource,
                                           EnderecoSaveResource {

}
