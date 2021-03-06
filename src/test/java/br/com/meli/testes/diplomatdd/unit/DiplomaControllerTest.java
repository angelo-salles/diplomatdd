package br.com.meli.testes.diplomatdd.unit;

import br.com.meli.testes.diplomatdd.service.DiplomaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class DiplomaControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private DiplomaService diplomaService;

    @Test
    void shouldValidateInputs() throws Exception {

    }
}
