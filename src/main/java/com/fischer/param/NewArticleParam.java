package com.fischer.param;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author fisher
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonRootName("article")
public class NewArticleParam {

    private String title;
    private String description;
    private String content;
    private Integer type;


}