package com.unialfa.base.business.endereco.service;

import com.unialfa.base.business.endereco.repository.EnderecoRepository;
import com.unialfa.base.business.endereco.service.plus.EnderecoDeleteById;
import com.unialfa.base.business.endereco.service.plus.EnderecoFindAll;
import com.unialfa.base.business.endereco.service.plus.EnderecoFindById;
import com.unialfa.base.business.endereco.service.plus.EnderecoSave;
import org.springframework.stereotype.Service;

@Service
public interface EnderecoService extends EnderecoFindById,
                                         EnderecoFindAll,
                                         EnderecoSave,
                                         EnderecoDeleteById,
                                         EnderecoRepository {
}
