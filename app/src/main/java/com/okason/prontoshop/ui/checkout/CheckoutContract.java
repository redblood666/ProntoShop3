package com.okason.prontoshop.ui.checkout;

import com.okason.prontoshop.core.listeners.OnDatabaseOperationCompleteListener;
import com.okason.prontoshop.models.LineItem;

import java.util.List;

/**
 * Created by Valentine on 4/7/2016.
 */
public class CheckoutContract {
    public interface View{
        void showLineItem(List<LineItem> lineItems);
        void showEmptyText();
        void showCartTotals(double tax, double subtotal, double total);
        void showConfirmCheckout();
        void showConfirmClearCart();
        void hideEmptyText();
        void showMessage(String message);

    }

    public interface Actions{
        void loadLineItems();
        void onCheckoutButtonClicked();
        void onDeleteItemButtonClicked(LineItem item);
        void checkout();
        void onClearButtonClicked();
        void clearShoppingCart();
        void setPaymentType(String paymentType);
        void markAsPaid(boolean isPaid);
        void onItemQuantityChanged(LineItem item, int qty);
    }

    public interface Repository{
        List<LineItem> getAllLineItemsInATransaction(long transactionId);
        long saveLineItem(LineItem lineItem, OnDatabaseOperationCompleteListener listener);
        void updateLineItem(LineItem lineItem, OnDatabaseOperationCompleteListener listener);
        LineItem getLineItemById(long id);
        void deleteLineItem(long id, OnDatabaseOperationCompleteListener listener);


    }




}
