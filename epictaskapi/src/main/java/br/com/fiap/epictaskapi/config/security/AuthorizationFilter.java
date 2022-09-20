package br.com.fiap.epictaskapi.config.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class AuthorizationFilter extends UsernamePasswordAuthenticationFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        // pegar o cabeçalho

        // verificar se tem o prefixo bearer

        // verificar se token é válido (assinatura)

        // retornar o usuário -> seguindo com o filtro

        //caso contrário - return null

    }

    
    
}
