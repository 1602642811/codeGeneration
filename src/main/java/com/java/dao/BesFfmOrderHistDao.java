package com.java.dao;

import com.java.entity.BesFfmOrderHist;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (BesFfmOrderHist)表数据库访问层
 *
 * @author makejava
 * @since 2023-02-15 12:03:58
 */
public interface BesFfmOrderHistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param fulfillmentId 主键
     * @return 实例对象
     */
    BesFfmOrderHist queryById(Integer fulfillmentId);

    /**
     * 查询指定行数据
     *
     * @param besFfmOrderHist 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<BesFfmOrderHist> queryAllByLimit(BesFfmOrderHist besFfmOrderHist, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param besFfmOrderHist 查询条件
     * @return 总行数
     */
    long count(BesFfmOrderHist besFfmOrderHist);

    /**
     * 新增数据
     *
     * @param besFfmOrderHist 实例对象
     * @return 影响行数
     */
    int insert(BesFfmOrderHist besFfmOrderHist);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BesFfmOrderHist> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BesFfmOrderHist> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BesFfmOrderHist> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BesFfmOrderHist> entities);

    /**
     * 修改数据
     *
     * @param besFfmOrderHist 实例对象
     * @return 影响行数
     */
    int update(BesFfmOrderHist besFfmOrderHist);

    /**
     * 通过主键删除数据
     *
     * @param fulfillmentId 主键
     * @return 影响行数
     */
    int deleteById(Integer fulfillmentId);

}

