/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canterita.challenge.backend.test.repository;

import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import org.junit.*;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * @author TheLegends
 */
public class DetailsRepositoryEntityTest {

    public DetailsRepositoryEntityTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findByidOrder method, of class DetailsRepositoryEntity.
     */
    @Test
    public void testFindByidOrder() {
        System.out.println("findByidOrder");
        Long id = null;
        OrderDetailsRepository instance = new DetailsRepositoryEntityImpl();
        ArrayList<OrderDetailsEntity> expResult = null;
        ArrayList<OrderDetailsEntity> result = instance.findByidOrder(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class DetailsRepositoryEntity.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Optional<OrderDetailsEntity> optional = null;
        OrderDetailsRepository instance = new DetailsRepositoryEntityImpl();
        instance.save(optional);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DetailsRepositoryEntityImpl implements OrderDetailsRepository {

        public ArrayList<OrderDetailsEntity> findByidOrder(Long id) {
            return null;
        }

        public void save(Optional<OrderDetailsEntity> optional) {
        }

        @Override
        public List<OrderDetailsEntity> findAll() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<OrderDetailsEntity> findAll(Sort arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<OrderDetailsEntity> findAllById(Iterable<Long> arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <S extends OrderDetailsEntity> List<S> saveAll(Iterable<S> arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void flush() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <S extends OrderDetailsEntity> S saveAndFlush(S arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void deleteInBatch(Iterable<OrderDetailsEntity> arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void deleteAllInBatch() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public OrderDetailsEntity getOne(Long arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <S extends OrderDetailsEntity> List<S> findAll(Example<S> arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <S extends OrderDetailsEntity> List<S> findAll(Example<S> arg0, Sort arg1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Page<OrderDetailsEntity> findAll(Pageable arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <S extends OrderDetailsEntity> S save(S arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Optional<OrderDetailsEntity> findById(Long arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean existsById(Long arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public long count() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void deleteById(Long arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void delete(OrderDetailsEntity arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void deleteAll(Iterable<? extends OrderDetailsEntity> arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void deleteAll() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <S extends OrderDetailsEntity> Optional<S> findOne(Example<S> arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <S extends OrderDetailsEntity> Page<S> findAll(Example<S> arg0, Pageable arg1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <S extends OrderDetailsEntity> long count(Example<S> arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <S extends OrderDetailsEntity> boolean exists(Example<S> arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
