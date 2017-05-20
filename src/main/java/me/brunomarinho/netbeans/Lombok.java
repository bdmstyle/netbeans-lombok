/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.brunomarinho.netbeans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Lombok {
    
    private String string;
    private Integer number;
}
