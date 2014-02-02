/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.ac.solusiuniversity.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 *
 * @author given
 */
public class ProposedStudy {
    @Id
    private String id;
    @DBRef
    private List<Bachelor> bachelors;
    private String BEdLevel;
    private boolean fullTime;
}
