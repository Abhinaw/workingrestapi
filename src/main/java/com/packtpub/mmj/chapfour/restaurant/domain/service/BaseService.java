package com.packtpub.mmj.chapfour.restaurant.domain.service;

import com.packtpub.mmj.chapfour.restaurant.domain.model.entity.Restaurant;
import com.packtpub.mmj.chapfour.restaurant.domain.repository.ReadOnlyRepository;
import com.packtpub.mmj.chapfour.restaurant.domain.repository.Repository;
import com.packtpub.mmj.chapfour.restaurant.domain.repository.RestaurantRepository;
import java.util.Collection;

/**
 *
 * @author Sourabh Sharma
 * @param <TE>
 * @param <T>
 */
public abstract class BaseService<TE, T> extends ReadOnlyBaseService<TE, T> {

    private Repository<TE, T> _repository;

    BaseService(RestaurantRepository<Restaurant, String> repository) {
        super((ReadOnlyRepository<TE, T>) repository);
        _repository = (Repository<TE, T>) repository;
    }

    /**
     *
     * @param entity
     * @throws Exception
     */
    public void add(TE entity) throws Exception {
        _repository.add(entity);
    }

    /**
     *
     * @return
     */
    public Collection<TE> getAll() {
        return _repository.getAll();
    }
}
