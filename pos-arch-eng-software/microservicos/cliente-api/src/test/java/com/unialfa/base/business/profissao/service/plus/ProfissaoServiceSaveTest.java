package com.unialfa.base.business.profissao.service.plus;

import com.unialfa.base.business.profissao.Profissao;
import com.unialfa.base.business.profissao.service.ProfissaoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfissaoServiceSaveTest {

    @Autowired
    private ProfissaoService profissaoService;

    private Profissao getProfissao(String descricao) {
        Profissao profissao = new Profissao();
        profissao.setDescricao(descricao);

        return profissao;
    }

    @Test
    public void saveSuccessTest() {
        Profissao profissao = getProfissao("Full stack developer");

        profissao = this.profissaoService.save(profissao);

        assertThat(profissao).isNotNull();
        assertThat(profissao.getId()).isNotNull();
    }

    @Test(expected = ConstraintViolationException.class)
    public void saveNullTest() {
        Profissao profissao = getProfissao(null);

        this.profissaoService.save(profissao);
    }
}
