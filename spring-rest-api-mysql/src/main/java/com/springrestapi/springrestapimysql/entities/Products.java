package com.springrestapi.springrestapimysql.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_tbl")
public class Products {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int quantity;

    private int price;

}
