/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.edu.utfpr.alunos.atividaderesolucaodeproblemas.entidade.Aula;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rodrigo
 */
public interface AulaDao extends JpaRepository<Aula, Long>{
    
}