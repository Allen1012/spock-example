package com.javakk.spock.mapper;

import com.javakk.spock.model.OrderDTO;
import com.javakk.spock.model.OrderVO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-23T20:02:29+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_322 (BellSoft)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderVO convert(OrderDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        OrderVO orderVO = new OrderVO();

        orderVO.setOrderNum( requestDTO.getOrderNum() );
        orderVO.setAmount( requestDTO.getAmount() );
        orderVO.setCreateTime( requestDTO.getCreateTime() );
        orderVO.setType( requestDTO.getType() );

        return orderVO;
    }
}
