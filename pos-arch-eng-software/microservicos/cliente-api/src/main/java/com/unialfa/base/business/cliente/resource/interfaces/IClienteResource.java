package com.unialfa.base.business.cliente.resource.interfaces;

import com.unialfa.base.business.cliente.resource.plus.ClienteDeleteByIdResource;
import com.unialfa.base.business.cliente.resource.plus.ClienteFindByIdEnderecoResource;
import com.unialfa.base.business.cliente.resource.plus.ClienteFindAllResource;
import com.unialfa.base.business.cliente.resource.plus.ClienteFindByIdResource;
import com.unialfa.base.business.cliente.resource.plus.ClienteGetServiceResource;
import com.unialfa.base.business.cliente.resource.plus.ClienteSaveResource;

public interface IClienteResource extends ClienteDeleteByIdResource,
                                          ClienteFindAllResource,
                                          ClienteFindByIdResource,
                                          ClienteGetServiceResource,
                                          ClienteSaveResource,
                                          ClienteFindByIdEnderecoResource {
}
