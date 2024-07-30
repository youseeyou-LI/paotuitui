package com.paotuitui.mapper;

import com.paotuitui.domain.Audit;
import com.paotuitui.domain.AuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    long countByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int deleteByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int insert(Audit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int insertSelective(Audit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    Audit selectOneByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    List<Audit> selectByExample(AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    Audit selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int updateByExampleSelective(@Param("record") Audit record, @Param("example") AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int updateByExample(@Param("record") Audit record, @Param("example") AuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int updateByPrimaryKeySelective(Audit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int updateByPrimaryKey(Audit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int batchInsert(@Param("list") List<Audit> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table audit
     *
     * @mbg.generated Tue Jul 30 16:18:38 CST 2024
     */
    int batchInsertSelective(@Param("list") List<Audit> list, @Param("selective") Audit.Column ... selective);
}