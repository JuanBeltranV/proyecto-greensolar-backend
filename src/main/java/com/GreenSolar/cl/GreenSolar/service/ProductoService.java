package com.GreenSolar.cl.GreenSolar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GreenSolar.cl.GreenSolar.model.Producto;
import com.GreenSolar.cl.GreenSolar.repository.ProductoRepository;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> getProductoById(Long id) {
        return productoRepository.findById(id);
    }

    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Optional<Producto> updateProducto(Long id, Producto datos) {
        return productoRepository.findById(id).map(p -> {
            p.setNombre(datos.getNombre());
            p.setPrecio(datos.getPrecio());
            p.setCategoria(datos.getCategoria());
            p.setProveedor(datos.getProveedor());
            return productoRepository.save(p);
        });
    }

    public boolean deleteProducto(Long id) {
        return productoRepository.findById(id).map(p -> {
            productoRepository.delete(p);
            return true;
        }).orElse(false);
    }
}
