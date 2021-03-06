package com.okason.prontoshop.core.dagger;

import com.okason.prontoshop.common.MainActivity;
import com.okason.prontoshop.data.sqlite.LineItemSQLiteRepository;
import com.okason.prontoshop.data.sqlite.SQLiteReport;
import com.okason.prontoshop.data.sqlite.TransactionSQLiteRepository;
import com.okason.prontoshop.ui.addCustomer.AddCustomerPresenter;
import com.okason.prontoshop.ui.addProduct.AddProductPresenter;
import com.okason.prontoshop.ui.checkout.CheckoutPresenter;
import com.okason.prontoshop.ui.customers.CustomerListPresenter;
import com.okason.prontoshop.ui.products.ProductListPresenter;
import com.okason.prontoshop.ui.transactions.TransactionListFragment;
import com.okason.prontoshop.ui.transactions.TransactionPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Valentine on 4/18/2016.
 */

@Singleton
@Component(
        modules = {
                AppModule.class,
                ShoppingCartModule.class,
                BusModule.class,
                PersistenceModule.class
        }
)
public interface AppComponent {
        void inject(ProductListPresenter presenter);
        void inject(CustomerListPresenter presenter);
        void inject(AddCustomerPresenter presenter);
        void inject(CheckoutPresenter presenter);
        void inject(AddProductPresenter presenter);
        void inject(TransactionPresenter presenter);
        void inject(TransactionListFragment fragment);
        void inject(MainActivity activity);
        void inject(TransactionSQLiteRepository repository);
        void inject(SQLiteReport report);
        void inject(LineItemSQLiteRepository repository);


}
