package factory_mode.abstract_factory.material_factory;

import factory_mode.abstract_factory.base_materialfactory.MaterialFactory;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2018/12/4
 */
public class ChinaMaterialFactory implements MaterialFactory {
    @Override
    public String getPotato() {
        return "郴州西红柿";
    }

    @Override
    public String getMilk() {
        return "郴州奶油";
    }

    @Override
    public String getVegetables() {
        return "郴州大白菜";
    }
}
