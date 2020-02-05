package com.duyi.repository;

import com.duyi.model.Guest;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承jpa仓库 拥有通用数据接口
 */
public interface GuestRepository extends JpaRepository<Guest,Long> {
}
