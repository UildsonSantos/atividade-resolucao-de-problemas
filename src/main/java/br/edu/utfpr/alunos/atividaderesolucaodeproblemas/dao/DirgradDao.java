/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.alunos.atividaderesolucaodeproblemas.dao;

import br.edu.utfpr.alunos.atividaderesolucaodeproblemas.entidade.Dirgrad;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rodrigo
 */
public interface DirgradDao extends JpaRepository<Dirgrad, Long> {
    
}
