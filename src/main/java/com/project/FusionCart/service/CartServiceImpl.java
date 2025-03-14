package com.project.FusionCart.service;

import com.project.FusionCart.repository.CartItemRepo;
import com.project.FusionCart.repository.CartRepo;
import com.project.FusionCart.repository.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class CartServiceImpl {
    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CartItemRepo cartItemRepo;

    @Autowired
    private ModelMapper modelMapper;
}
