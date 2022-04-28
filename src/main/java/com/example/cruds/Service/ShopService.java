package com.example.cruds.Service;
import com.example.cruds.model.Shop;
import com.example.cruds.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;
    public List<Shop> listAllShop() {
        return shopRepository.findAll();
    }

    public void saveShop(Shop shop) {
       shopRepository.save(shop);
    }

    public Shop getShop(Integer id) {
        return shopRepository.findById(id).get(id);
    }

    //find location
    public List<Shop> getShopLocation(String shopLocation){
        return shopRepository.findShopByShopLocation(shopLocation);
    }


}
