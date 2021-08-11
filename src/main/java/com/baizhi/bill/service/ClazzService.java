package com.baizhi.bill.service;


import com.baizhi.bill.entity.Clazz;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

//changed
@Service
public interface ClazzService {
     List<Clazz> findQueryAll();

    int add(Clazz clazz);

    List<Clazz> getList(HashMap<String, Object> map);

    int getTotal(HashMap<String, Object> map);
}
