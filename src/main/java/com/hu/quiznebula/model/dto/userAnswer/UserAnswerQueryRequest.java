package com.hu.quiznebula.model.dto.userAnswer;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.hu.quiznebula.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 查询用户答案表请求
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserAnswerQueryRequest extends PageRequest implements Serializable {

    /**
     *id
     */
    private Long id;

    /**
     * 应用 id
     */
    private Long appId;

    /**
     * 评分策略（0-自定义，1-AI）
     */
    private Integer scoringStrategy;

    /**
     * 用户答案（JSON 数组）
     */
    private String choices;

    /**
     * 评分结果 id
     */
    private Long resultId;

    /**
     * 结果名称，如物流师
     */
    private String resultName;

    /**
     * 结果描述
     */
    private String resultDesc;

    /**
     * 结果图标
     */
    private String resultPicture;

    /**
     * 得分
     */
    private Integer resultScore;

    /**
     * 用户 id
     */
    private Long userId;

    /**
     * id
     */
    private Long notId;
    /**
     * 搜索词
     */
    private String searchText;
    private static final long serialVersionUID = 1L;
}