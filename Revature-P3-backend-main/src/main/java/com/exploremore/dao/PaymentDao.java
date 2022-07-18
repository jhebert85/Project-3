package com.exploremore.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exploremore.entity.PaymentEntity;

@Repository
public interface PaymentDao extends JpaRepository<PaymentEntity, Integer>{
	
	@Query("SELECT u FROM PaymentEntity u WHERE u.userId=:userId")
	Optional<PaymentEntity> findByUserId(@Param("userId")int userId);
	
}
