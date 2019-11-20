package com.unialfa.base.business.profissao.service.plus;

import com.unialfa.base.business.profissao.Profissao;
import com.unialfa.base.business.profissao.service.ProfissaoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ProfissaoServiceSaveTest {

    @Mock
    private ProfissaoService profissaoService;

    private Profissao getProfissao(String descricao) {
        Profissao profissao = new Profissao();
        profissao.setDescricao(descricao);

        return profissao;
    }

    @Test
    public void saveTest() {
        Profissao profissao = getProfissao(null);

        this.profissaoService.save(profissao);
    }
}
